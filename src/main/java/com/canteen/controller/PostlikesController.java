package com.canteen.controller;

import com.canteen.bean.Communitypost;
import com.canteen.bean.Postlikes;
import com.canteen.bean.ResultObject;
import com.canteen.service.PostlikesService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Postlikes")
@RestController
public class PostlikesController {
    @Autowired
    private PostlikesService postlikesService;
    //点赞
    @RequestMapping("/addPostlikes")
    public ResultObject<Object> addCommunityPost(@RequestParam("postid") int postid,
                                                 @RequestParam("userid") int userid) {
        ResultObject<Object> result = new ResultObject<>();
        Postlikes postlikes=new Postlikes();
        postlikes.setPostid(postid);
        postlikes.setUserid(userid);
        Integer id = postlikesService.insert(postlikes);
//        System.out.println(postlikes.getLikeid());
        if (id != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("点赞成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("点赞失败");
        }

        return result;
    }
}
