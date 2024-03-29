package com.canteen.controller;

import com.canteen.bean.Dish;
import com.canteen.bean.ResultObject;
import com.canteen.service.DishService;
import com.canteen.util.Constant;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 所有用户：
 *   查看菜品（getAllDishes）
 *   搜索菜品（searchDish）
 *   计算菜品评分（calcDishRate）
 *
 * 食堂管理员：
 *   [编号、菜名、价格、促销价格、菜系、所属食堂ID、菜品描述、图片路径]
 *   添加菜品（addDish）
 *   删除菜品（deleteDish）
 *   修改菜品信息（updateDish）
 *
 * 师生用户：
 *
 *
 */
@RequestMapping("/dish")
@RestController
public class DishController {
    @Autowired
    private DishService dishService;

    @RequestMapping("/getAllDishes")
    public ResultObject<List<Dish>> getAllDishes(Dish dish, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        System.out.println(dish);
        PageInfo<Dish> pageInfo=dishService.getAllDish(dish, page, limit);
        ResultObject<List<Dish>> rs=new ResultObject<List<Dish>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo.getList());
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    @RequestMapping("/getDishesByCanteen")
    public ResultObject<List<Dish>> getDishesByCanteen(@RequestParam("canteenid") int canteenid) {
        System.out.println("SUC");
        ResultObject<List<Dish>> rs=new ResultObject<List<Dish>>();
        List<Dish> list=dishService.getDishesByCanteen(canteenid);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        int total=list.size();
        Long a=Long.parseLong(String.valueOf(total));
        rs.setCount(a);
        return rs;
    }

    @RequestMapping("/searchDish")
    public ResultObject<Dish> searchDish(@RequestParam("dishID") int dishID) {
        ResultObject<Dish> rs=new ResultObject<Dish>();
        Dish dish=dishService.searchDishByNo(dishID);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(dish);
        return rs;
    }

    @RequestMapping("/addDish")
    public ResultObject<Object> addDish(Dish dish) {
        ResultObject<Object> rs = new ResultObject<>();
        Integer id = dishService.addDish(dish);
        if (id != null) {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("增加菜品信息成功");
        } else {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("增加菜品信息失败");
        }
        return rs;
    }

    @RequestMapping("/deleteDish")
    public ResultObject<Object> deleteDish(@RequestParam("dishID") int dishID) {
        Integer total=dishService.deleteDish(dishID);
        //统一返回
        ResultObject<Object> rs=new ResultObject<Object>();
        if(null==total||0==total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("删除菜品信息失败");
        }else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("删除菜品信息成功");
        }
        return rs;
    }

    @RequestMapping("/updateDish")
    public ResultObject<Object> updateDish(Dish dish) {
        Integer total=dishService.updateDish(dish);
        //统一返回
        ResultObject<Object> rs=new ResultObject<Object>();
        if(null==total||0==total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("修改菜品信息失败");
        }else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("修改菜品信息成功");
        }
        return rs;
    }

    /**
     * 获取菜品下拉框
     * @return
     */
    @RequestMapping("/dishSelect")
    public ResultObject<List<Dish>> dishSelect() {
        ResultObject<List<Dish>> rs=new ResultObject<List<Dish>>();
        List<Dish> list=dishService.selectAllDish();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        int total=list.size();
        Long a=Long.parseLong(String.valueOf(total));
        rs.setCount(a);
        return rs;
    }

}
