package com.canteen.controller;

import com.canteen.bean.Postreply;
import com.canteen.bean.ResultObject;
import com.canteen.service.PostreplyService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Postreply")
@RestController
public class PostreplyController {

    @Autowired
    private PostreplyService postreplyService;

    // 新增回复
    @RequestMapping("/addPostReply")
    public ResultObject<Object> addPostReply(@RequestParam("postId") int postId,
                                             @RequestParam("userId") int userId,
                                             @RequestParam("content") String content) {
        ResultObject<Object> result = new ResultObject<>();

        Postreply postreply = new Postreply();
        postreply.setPostid(postId);
        postreply.setUserid(userId);
        postreply.setReplycontent(content);

        int id = postreplyService.insert(postreply);

        if (id > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("新增回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("新增回复失败");
        }

        return result;
    }

    // 删除回复
    @RequestMapping("/deletePostReply")
    public ResultObject<Object> deletePostReply(@RequestParam("replyId") int replyId) {
        ResultObject<Object> result = new ResultObject<>();

        int success = postreplyService.deleteByPrimaryKey(replyId);

        if (success > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除回复失败");
        }

        return result;
    }

    // 修改回复
    @RequestMapping("/updatePostReply")
    public ResultObject<Object> updatePostReply(@RequestParam("replyId") int replyId,
                                                @RequestParam("content") String content) {
        ResultObject<Object> result = new ResultObject<>();

        Postreply record = postreplyService.selectByPrimaryKey(replyId); // 根据主键查询回复对象
        record.setReplycontent(content); // 设置回复内容为传入的参数值

        int rows = postreplyService.updateByPrimaryKey(record); // 调用updateByPrimaryKey方法更新回复内容

        if (rows > 0) { // 判断更新是否成功
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改回复成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改回复失败");
        }

        return result;
    }


    // 查询回复
    @RequestMapping("/getPostReply")
    public ResultObject<Postreply> getPostReply(@RequestParam("replyId") int replyId) {
        ResultObject<Postreply> result = new ResultObject<>();

        Postreply postreply = postreplyService.selectByPrimaryKey(replyId);

        if (postreply != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询回复成功");
            result.setData(postreply);
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询回复失败");
        }

        return result;
    }
}
