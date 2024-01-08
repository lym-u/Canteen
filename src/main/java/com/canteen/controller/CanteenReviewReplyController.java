package com.canteen.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.canteen.bean.Canteenreviewreply;
import com.canteen.bean.CanteenreviewreplyExample;
import com.canteen.bean.Postreply;
import com.canteen.bean.ResultObject;
import com.canteen.service.CanteenReviewReplyService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CanteenReviewReply")
public class CanteenReviewReplyController {

    @Autowired
    private CanteenReviewReplyService canteenReviewReplyService;

    // 新增餐厅评论回复
    @PostMapping("/addCanteenReviewReply")
    public ResultObject<Object> addCanteenReviewReply(@RequestParam("canteenReviewId") int canteenReviewId,
                                                      @RequestParam("managerId") int managerId,
                                                      @RequestParam("replyContent") String replyContent) {
        ResultObject<Object> result = new ResultObject<>();

        Canteenreviewreply canteenReviewReply = new Canteenreviewreply();
        canteenReviewReply.setCanteenreviewid(canteenReviewId);
        canteenReviewReply.setManagerid(managerId);
        canteenReviewReply.setReplycontent(replyContent);


        int id = canteenReviewReplyService.insert(canteenReviewReply);

        if (id > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("新增餐厅评论回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("新增餐厅评论回复失败");
        }

        return result;
    }

    // 删除餐厅评论回复
    @DeleteMapping("/deleteCanteenReviewReply")
    public ResultObject<Object> deleteCanteenReviewReply(@PathVariable Integer replyId) {
        ResultObject<Object> result = new ResultObject<>();

        int success = canteenReviewReplyService.deleteByPrimaryKey(replyId);

        if (success > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除餐厅评论回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除餐厅评论回复失败");
        }

        return result;
    }

    // 修改餐厅评论回复
    @PutMapping("/updateCanteenReviewReply")
    public ResultObject<Object> updateCanteenReviewReply(@PathVariable Integer replyId, @RequestBody Canteenreviewreply canteenreviewreply) {
        ResultObject<Object> result = new ResultObject<>();

        canteenreviewreply.setReplyid(replyId);

        int rows = canteenReviewReplyService.updateByPrimaryKeySelective(canteenreviewreply);

        if (rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改餐厅评论回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改餐厅评论回复失败");
        }

        return result;
    }

    // 查询餐厅评论回复
    @GetMapping("/getCanteenReviewReply")
    public ResultObject<Canteenreviewreply> getCanteenReviewReplyById(@PathVariable Integer replyId) {
        ResultObject<Canteenreviewreply> result = new ResultObject<>();

        Canteenreviewreply canteenreviewreply = canteenReviewReplyService.selectByPrimaryKey(replyId);

        if (canteenreviewreply != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询餐厅评论回复成功");
            result.setData(canteenreviewreply);
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询餐厅评论回复失败");
        }

        return result;
    }



    // 查询是否已回复餐厅评论
    // 根据是否有评价编号来判断是否回复
// 根据评价编号列表判断是否已回复
    @GetMapping("/checkIfRepliedBatch")
    public ResultObject<Map<Integer, Boolean>> checkIfRepliedBatch(@RequestParam("canteenReviewIds") List<Integer> canteenReviewIds) {
        ResultObject<Map<Integer, Boolean>> result = new ResultObject<>();
        Map<Integer, Boolean> replyStatusMap = new HashMap<>();

        for (int canteenReviewId : canteenReviewIds) {
            CanteenreviewreplyExample example = new CanteenreviewreplyExample();
            CanteenreviewreplyExample.Criteria criteria = example.createCriteria();
            criteria.andCanteenreviewidEqualTo(canteenReviewId);

            List<Canteenreviewreply> replyList = canteenReviewReplyService.selectByExample(example);
            boolean hasReplied = replyList != null && !replyList.isEmpty();


            replyStatusMap.put(canteenReviewId, hasReplied);
        }

        // 在遍历完所有canteenReviewIds后，检查replyStatusMap是否包含所有的canteenReviewIds
        for (int canteenReviewId : canteenReviewIds) {
            if (!replyStatusMap.containsKey(canteenReviewId)) {
                // 如果replyStatusMap中不包含某个canteenReviewId，则将其对应的值设为false
                replyStatusMap.put(canteenReviewId, false);
            }
        }

        result.setCode(Constant.SUCCESS_RETUEN_CODE);
        result.setMsg("批量查询是否已回复成功");
        result.setData(replyStatusMap);

        return result;
    }


    // 在 CanteenReviewReplyController 类中添加一个新的接口方法
// 判断是否已回复餐厅评论
    @GetMapping("/checkCanteenReviewReply")
    public ResultObject<Boolean> checkCanteenReviewReply(@RequestParam("canteenReviewId") int canteenReviewId) {
        ResultObject<Boolean> result = new ResultObject<>();

        // 根据评论编号查询是否已存在回复
        CanteenreviewreplyExample example = new CanteenreviewreplyExample();
        example.createCriteria().andCanteenreviewidEqualTo(canteenReviewId);
        List<Canteenreviewreply> replyList = canteenReviewReplyService.selectByExample(example);

        boolean hasReplied = !replyList.isEmpty();  // 判断是否已存在回复

        result.setCode(Constant.SUCCESS_RETUEN_CODE);
        result.setMsg("查询餐厅评论回复成功");
        result.setData(hasReplied);

        return result;
    }




}



