package com.canteen.controller;

import com.canteen.bean.Canteen;
import com.canteen.bean.CanteenExample;
import com.canteen.bean.ResultObject;
import com.canteen.service.CanteenService;
import com.canteen.util.Constant;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 所有用户：
 *   查看食堂（getAllCanteen）
 *   查询食堂（serchCanteen）
 *   计算菜品评分（calcCanteenRate）
 *
 * 系统管理员：
 *   [编号、名称、位置、建立时间、管理员]
 *   添加食堂（addCanteen）
 *   删除食堂（deleteCanteen）
 *   修改食堂信息（updateCanteen）
 *   设置食堂管理员（setCanteen）
 *
 * 食堂管理员：
 *   [营业时间、简介]
 *   维护食堂信息（editCanteen）
 *
 * 师生用户：
 *
 */
@RequestMapping("/canteen")
@RestController //标识为返回类型为Json的控制器
public class CanteenController {

    @Autowired
    private CanteenService canteenService;

    //标识请求地址
//    @RequestMapping("/getAllCanteen")
//    public ResultObject<List<Canteen>> getAllCanteen(Canteen canteen, HttpServletRequest request) {
//        ResultObject<List<Canteen>> rs=new ResultObject<List<Canteen>>();
//        return rs;
//    }
//    @RequestMapping("/getAllCanteens")
//    //查询全部食堂（按食堂ID升序）
//    public ResultObject<List<Canteen>> getAllCanteens() {
//        ResultObject<List<Canteen>> result = new ResultObject<>();
//        CanteenExample example = new CanteenExample();
//        example.setOrderByClause("canteenid ASC");
//        List<Canteen> canteens = canteenService.selectByExample(example);
////        List<Canteen> canteens = canteenService.getAllCanteens();
//        result.setCode(Constant.SUCCESS_RETUEN_CODE);
//        result.setMsg("查询成功");
//        result.setData(canteens);
//        int total=canteens.size();
//        Long a=Long.parseLong(String.valueOf(total));
//        result.setCount(a);
//        return result;
//    }

    @RequestMapping("/getAllCanteen")
    public ResultObject<List<Canteen>> getUsers(CanteenExample example,@RequestParam("limit") int limit,@RequestParam("page") int page) {
        System.out.println(example);
        PageInfo<Canteen> pageInfo=canteenService.getAll(example, page, limit);
        ResultObject<List<Canteen>> rs=new ResultObject<List<Canteen>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo.getList());
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    @RequestMapping("/getAllCanteens")
//查询全部食堂（按食堂ID升序）
    public ResultObject<List<Canteen>> getAllCanteens() {
        ResultObject<List<Canteen>> result = new ResultObject<>();
        CanteenExample example = new CanteenExample();
        example.setOrderByClause("canteenid ASC");
        List<Canteen> canteens = canteenService.selectByExample(example);

        if (canteens != null && !canteens.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            result.setData(canteens);
            result.setCount((long) canteens.size());
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询失败或您查询的数据为空");
            result.setData(new ArrayList<>());
            result.setCount(0L);
        }

        return result;
    }
    //根据食堂id查询食堂信息
    @RequestMapping("/getCanteenById")
    public ResultObject<Canteen> getCanteenById(@RequestParam("id") int id) {
        ResultObject<Canteen> result = new ResultObject<>();
// 创建 CanteenExample 实例
        CanteenExample example = new CanteenExample();
// 创建 Criteria 对象，表示查询条件
        CanteenExample.Criteria criteria = example.createCriteria();
        criteria.andCanteenidEqualTo(id);
        List<Canteen> canteens = canteenService.selectByExample(example);
        if (canteens != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            for (Canteen canteen : canteens) {
                result.setData(canteen);
            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的食堂");
        }

        return result;
    }

    @RequestMapping("/addCanteen")
    public ResultObject<Object> addCanteen(@RequestBody Canteen canteen) {
        ResultObject<Object> result = new ResultObject<>();
        Integer id = canteenService.insert(canteen);
//        String a=canteen.getDescription();
//        System.out.println(a);
        if (id != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("增加食堂信息成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("增加食堂信息失败");
        }

        return result;
    }

    @RequestMapping("/updateCanteen")
    public ResultObject<Object> updateCanteen(@RequestBody Canteen canteen) {
        ResultObject<Object> result = new ResultObject<>();
//        Integer rows = canteenService.updateCanteen(canteen);
        Integer rows = canteenService.updateByPrimaryKey(canteen);
        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改食堂信息成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改食堂信息失败");
        }
        return result;
    }
    //按食堂id删除
    @RequestMapping("/deleteCanteen")
    public ResultObject<Object> deleteCanteen(@RequestParam("id") int id) {
        ResultObject<Object> result = new ResultObject<>();
        Integer rows = canteenService.deleteByPrimaryKey(id);
//        Integer rows = canteenService.deleteCanteen(id);
        if (rows != null && rows > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除食堂成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除食堂失败");
        }
        return result;
    }
}


