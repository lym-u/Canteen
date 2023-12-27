package com.canteen.controller;

import com.canteen.bean.Communitypost;
import com.canteen.bean.CommunitypostExample;
import com.canteen.bean.ResultObject;
import com.canteen.service.CommunitypostService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/communityPost")
@RestController
public class CommunityPostController {

    @Autowired
    private CommunitypostService communityPostService;

    @RequestMapping("/getAllCommunityPosts")
    public ResultObject<List<Communitypost>> getAllCommunityPosts() {
        ResultObject<List<Communitypost>> result = new ResultObject<>();
        CommunitypostExample example = new CommunitypostExample();
        example.setOrderByClause("postid ASC");
        List<Communitypost> communityPosts = communityPostService.selectByExample(example);

        if (communityPosts != null && !communityPosts.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            result.setData(communityPosts);
            result.setCount((long) communityPosts.size());
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询失败或您查询的数据为空");
            result.setData(new ArrayList<>());
            result.setCount(0L);
        }

        return result;
    }

    @RequestMapping("/getCommunityPostById")
    public ResultObject<Communitypost> getCommunityPostById(@RequestParam("id") int id) {
        ResultObject<Communitypost> result = new ResultObject<>();
        CommunitypostExample example = new CommunitypostExample();
        CommunitypostExample.Criteria criteria = example.createCriteria();
        criteria.andPostidEqualTo(id);
        List<Communitypost> communityPosts = communityPostService.selectByExample(example);

        if (communityPosts != null && !communityPosts.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            result.setData(communityPosts.get(0));
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的帖子");
        }

        return result;
    }

    @RequestMapping("/addCommunityPost")
    public ResultObject<Object> addCommunityPost(@RequestBody Communitypost communityPost) {
        ResultObject<Object> result = new ResultObject<>();
        Integer id = communityPostService.insert(communityPost);

        if (id != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("增加帖子成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("增加帖子失败");
        }

        return result;
    }

    @RequestMapping("/updateCommunityPost")
    public ResultObject<Object> updateCommunityPost(@RequestBody Communitypost communityPost) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = communityPostService.updateByPrimaryKey(communityPost);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改帖子成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改帖子失败");
        }

        return result;
    }

    @RequestMapping("/deleteCommunityPost")
    public ResultObject<Object> deleteCommunityPost(@RequestParam("id") int id) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = communityPostService.deleteByPrimaryKey(id);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除帖子成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除帖子失败");
        }

        return result;
    }
}
