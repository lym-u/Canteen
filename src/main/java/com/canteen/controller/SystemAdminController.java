package com.canteen.controller;

import com.canteen.bean.*;
import com.canteen.service.SystemAdminService;
import com.canteen.service.UserService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/SystemAdmin")
@RestController //标识为返回类型为Json的控制器
public class SystemAdminController {
    @Autowired
    private SystemAdminService systemAdminService;
    //师生用户登录
    @RequestMapping("/login")
    public ResultObject<Object> loginUser(@RequestParam("userName") Integer userId,
                                          @RequestParam("password") String pwd) {
        ResultObject<Object> result = new ResultObject<>();
        SystemadminExample example = new SystemadminExample();
        SystemadminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminidEqualTo(userId);
        criteria.andPasswordEqualTo(pwd);
        List<Systemadmin> users = systemAdminService.selectByExample(example);
        if (!users.isEmpty()){
            result.setCode(Constant.SUCCESS_RETUEN_CODE);
            result.setMsg("用户登录成功");

        }else{
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("用户登录失败");
        }
        return result;
    }
}
