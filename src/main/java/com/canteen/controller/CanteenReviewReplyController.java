package com.canteen.controller;

import com.canteen.bean.Canteenreviewreply;
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
}



