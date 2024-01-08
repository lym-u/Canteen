package com.canteen.controller;

import com.canteen.bean.Dish;
import com.canteen.bean.Dishreview;
import com.canteen.bean.DishreviewExample;
import com.canteen.bean.ResultObject;
import com.canteen.service.DishReviewService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/dishReview")
@RestController
public class DishReviewController {

    @Autowired
    private DishReviewService dishReviewService;

    @RequestMapping("/getAllDishReviews")
    public ResultObject<List<Dishreview>> getAllDishReviews() {
        ResultObject<List<Dishreview>> result = new ResultObject<>();
        DishreviewExample example = new DishreviewExample();
        example.setOrderByClause("dishreviewid ASC");
        List<Dishreview> reviews = dishReviewService.selectByExample(example);

        if (reviews != null && !reviews.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            result.setData(reviews);
            result.setCount((long) reviews.size());
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询失败或您查询的数据为空");
            result.setData(new ArrayList<>());
            result.setCount(0L);
        }

        return result;
    }

    @RequestMapping("/getDishReviewById")
    public ResultObject<Dishreview> getDishReviewById(@RequestParam("id") int id) {
        ResultObject<Dishreview> result = new ResultObject<>();
        DishreviewExample example = new DishreviewExample();
        DishreviewExample.Criteria criteria = example.createCriteria();
        criteria.andDishreviewidEqualTo(id);
        List<Dishreview> reviews = dishReviewService.selectByExample(example);

        if (reviews != null&&!reviews.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            for (Dishreview review : reviews) {
                result.setData(review);
            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的评论");
        }

        return result;
    }

    @RequestMapping("/getDishReviewByDish")
    public ResultObject<List<Dishreview>> getDishReviewByDish(@RequestParam("dishid") int dishid) {
        ResultObject<List<Dishreview>> rs=new ResultObject<List<Dishreview>>();
        List<Dishreview> list=dishReviewService.getDishReviewByDish(dishid);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        int total=list.size();
        Long a=Long.parseLong(String.valueOf(total));
        rs.setCount(a);
        return rs;
    }

    @RequestMapping("/addDishReview")
    public ResultObject<Object> addDishReview(@RequestBody Dishreview review) {
        ResultObject<Object> result = new ResultObject<>();
        Integer id = dishReviewService.insert(review);

        if (id != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("增加评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("增加评论失败");
        }

        return result;
    }

    @RequestMapping("/updateDishReview")
    public ResultObject<Object> updateDishReview(@RequestBody Dishreview review) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = dishReviewService.updateByPrimaryKey(review);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改评论失败");
        }

        return result;
    }

    @RequestMapping("/deleteDishReview")
    public ResultObject<Object> deleteDishReview(@RequestParam("id") int id) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = dishReviewService.deleteByPrimaryKey(id);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除评论失败");
        }

        return result;
    }
}