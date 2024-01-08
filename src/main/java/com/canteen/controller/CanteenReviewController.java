package com.canteen.controller;

import com.canteen.bean.*;
import com.canteen.bean.Canteenreview;
import com.canteen.bean.CanteenreviewExample;
import com.canteen.service.CanteenReviewService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
/**
 * 所有用户：
 *   查看食堂评价（getCanteenCmt）
 *   查看菜品评价（getDishCmt）
 *
 * 系统管理员：
 *   删除食堂评价（deleteCanteenCmt）
 *   删除菜品评价（deleteDishCmt）
 *
 * 食堂管理员：
 *   回复食堂评价（replyCanteenCmt）
 *   回复菜品评价（replyDishCmt）
 *
 * 师生用户：
 *   评价食堂（addCanteenCmt）
 *   评价菜品（addDishCmt）
 *   删除食堂评价（deleteCanteenCmt）
 *   删除菜品评价（deleteDishCmt）
 *
 */
@RequestMapping("/canteenreview")
@RestController
public class CanteenReviewController {

    @Autowired
    private CanteenReviewService canteenReviewService;

    @RequestMapping("/getAllCanteenReviews")
    public ResultObject<List<Canteenreview>> getAllCanteenReviews() {
        ResultObject<List<Canteenreview>> result = new ResultObject<>();
        CanteenreviewExample example = new CanteenreviewExample();
        example.setOrderByClause("canteenreviewid ASC");
        List<Canteenreview> reviews = canteenReviewService.selectByExample(example);

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

    @RequestMapping("/getCanteenReviewById")
    public ResultObject<Canteenreview> getCanteenReviewById(@RequestParam("id") int id) {
        ResultObject<Canteenreview> result = new ResultObject<>();
        CanteenreviewExample example = new CanteenreviewExample();
        CanteenreviewExample.Criteria criteria = example.createCriteria();
        criteria.andCanteenreviewidEqualTo(id);
        List<Canteenreview> reviews = canteenReviewService.selectByExample(example);

        if (reviews != null&&!reviews.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            for (Canteenreview review : reviews) {
                result.setData(review);
            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的评论");
        }

        return result;
    }

    @RequestMapping("/addCanteenReview")
    public ResultObject<Object> addCanteenReview(@RequestBody Canteenreview review) {
        ResultObject<Object> result = new ResultObject<>();
        Integer id = canteenReviewService.insert(review);

        if (id != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("增加评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("增加评论失败");
        }

        return result;
    }

    @RequestMapping("/updateCanteenReview")
    public ResultObject<Object> updateCanteenReview(@RequestBody Canteenreview review) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = canteenReviewService.updateByPrimaryKey(review);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改评论失败");
        }

        return result;
    }

    @RequestMapping("/deleteCanteenReview")
    public ResultObject<Object> deleteCanteenReview(@RequestParam("id") int id) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = canteenReviewService.deleteByPrimaryKey(id);

        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除评论成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除评论失败");
        }

        return result;
    }

    @RequestMapping("/getCanteenReviewsByCanteenId")
    public ResultObject<List<Canteenreview>> getCanteenNames(@RequestParam("id") int id) {
        ResultObject<List<Canteenreview>> result = new ResultObject<>();
// 创建 CanteenExample 实例
        CanteenreviewExample example = new CanteenreviewExample();
// 创建 Criteria 对象，表示查询条件
        CanteenreviewExample.Criteria criteria = example.createCriteria();
        criteria.andCanteenidEqualTo(id);
        List<Canteenreview> canteenreviews = canteenReviewService.selectByExample(example);
        System.out.println(id);
        for (Canteenreview c:canteenreviews
        ) {
            System.out.println("1");
            System.out.println(c.getCanteenid());
        }
        if (canteenreviews != null&& !canteenreviews.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            for (Canteenreview  canteenreview : canteenreviews) {
                result.setData(canteenreviews);
            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的食堂");
        }

        return result;
    }


    @RequestMapping("/getAllReviewIds")
    public ResultObject<List<Integer>> getAllReviewIds() {
        ResultObject<List<Integer>> result = new ResultObject<>();
        CanteenreviewExample example = new CanteenreviewExample();
        List<Canteenreview> reviews = canteenReviewService.selectByExample(example); // 使用service中已有的selectByExample方法获取所有评论
        List<Integer> reviewIds = new ArrayList<>();
        for (Canteenreview review : reviews) {
            reviewIds.add(review.getCanteenreviewid());
        }
        result.setCode(Constant.SUCCESS_RETUEN_CODE);
        result.setMsg("成功获取所有评论的评论编号");
        result.setData(reviewIds);
        return result;
    }




}