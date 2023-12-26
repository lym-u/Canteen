package com.canteen.controller;

import com.canteen.bean.*;
import com.canteen.service.CanteenManagerService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/canteenmanager")
@RestController
public class CanteenManagerController {
    @Autowired
    private CanteenManagerService canteenManagerService;

    @RequestMapping("/getAllCanteenManagers")
    //查询全部食堂管理员
    public ResultObject<List<Canteenmanager>> getAllCanteenManagers() {
        ResultObject<List<Canteenmanager>> result = new ResultObject<>();
        CanteenmanagerExample example = new CanteenmanagerExample();
        example.setOrderByClause("managerid ASC");
        List<Canteenmanager> canteenManagers = canteenManagerService.selectByExample(example);
        if (canteenManagers != null && !canteenManagers.isEmpty()) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            result.setData(canteenManagers);
            result.setCount((long) canteenManagers.size());
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("查询失败或您查询的数据为空");
            result.setData(new ArrayList<>());
            result.setCount(0L);
        }
        return result;
    }

    @RequestMapping("/addCanteenManager")
    //添加食堂管理员
    public ResultObject<Object> addCanteenManager(@RequestBody Canteenmanager canteenManager) {
        ResultObject<Object> result = new ResultObject<>();
        int row = canteenManagerService.insert(canteenManager);
        if (row > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("添加食堂管理员成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("添加食堂管理员失败");
        }
        return result;
    }

    @RequestMapping("/updateCanteenManager")
    //修改食堂管理员信息
    public ResultObject<Object> updateCanteenManager(@RequestBody Canteenmanager canteenManager) {
        ResultObject<Object> result = new ResultObject<>();
        int row = canteenManagerService.updateByPrimaryKey(canteenManager);
        if (row > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("修改食堂管理员信息成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("修改食堂管理员信息失败");
        }
        return result;
    }

    @RequestMapping("/deleteCanteenManager")
    //删除食堂管理员
    public ResultObject<Object> deleteCanteenManager(@RequestParam("id") int id) {
        ResultObject<Object> result = new ResultObject<>();
        int row = canteenManagerService.deleteByPrimaryKey(id);
        if (row > 0) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("删除食堂管理员成功");
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("删除食堂管理员失败");
        }
        return result;
    }

    @RequestMapping("/getCanteenManagerById")
    //根据ID查询食堂管理员信息
    public ResultObject<Canteenmanager> getCanteenManagerById(@RequestParam("id") int id) {
        ResultObject<Canteenmanager> result = new ResultObject<>();
        CanteenmanagerExample example = new CanteenmanagerExample();
        CanteenmanagerExample.Criteria criteria = example.createCriteria();
        criteria.andManageridEqualTo(id);
        List<Canteenmanager>canteenManager = canteenManagerService.selectByExample(example);

        if (canteenManager != null) {
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("查询成功");
            for (Canteenmanager canteenmanager : canteenManager) {
                result.setData(canteenmanager);
            }
        } else {
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("未找到对应的食堂管理员");
        }
        return result;
    }
}
