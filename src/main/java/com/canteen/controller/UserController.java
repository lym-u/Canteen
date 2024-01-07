package com.canteen.controller;

import com.canteen.bean.*;
import com.canteen.service.UserService;
import com.canteen.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //师生用户登录
    @RequestMapping("/TstudentLogin")
    public ResultObject<Object> loginUser(@RequestParam("userName") Integer userId,
                                          @RequestParam("password") String pwd) {
        ResultObject<Object> result = new ResultObject<>();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andPasswordEqualTo(pwd);
        List<User> users = userService.selectByExample(example);
        if (!users.isEmpty()){
                result.setCode(Constant.SUCCESS_RETUEN_CODE);
                result.setMsg("用户登录成功");

        }else{
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("用户登录失败");
        }
        return result;
    }
    //注册功能，添加用户
    @RequestMapping("/addUser")
    public ResultObject<Object> addUser(@RequestBody User user) {
        ResultObject<Object> result = new ResultObject<>();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());
        List<User> users = userService.selectByExample(example);
        if (!users.isEmpty()){
            Integer id = userService.updateByPrimaryKey(user);
            if (id != null) {
                result.setCode(Constant.SUCCESS_RETUEN_CODE);
                result.setMsg("注册用户成功");
            } else {
                result.setCode(Constant.FAILURE_RETUEN_CODE);
                result.setMsg("注册用户失败");
            }
        }else{
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("您的用户id不存在");
        }
        return result;
    }
    //修改密码
    @RequestMapping("/updateUser")
    //传入新密码，和原有的user
    public ResultObject<Object> updateUser(@RequestParam("password") String pwd,@RequestBody User user) {
        ResultObject<Object> result = new ResultObject<>();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        List<User> users = userService.selectByExample(example);
        if (!users.isEmpty()){
            User updateuser=new User();
            updateuser.setUserid(user.getUserid());
            updateuser.setPassword(pwd);
            updateuser.setUsername(user.getUsername());
            Integer id = userService.updateByPrimaryKey(updateuser);
            if (id != null) {
                result.setCode(Constant.SUCCESS_RETUEN_CODE);
                result.setMsg("修改用户成功");
            } else {
                result.setCode(Constant.FAILURE_RETUEN_CODE);
                result.setMsg("修改用户失败");
            }
        }else{
            result.setCode(Constant.FAILURE_RETUEN_CODE);
            result.setMsg("您的用户id不存在");
        }
        return result;
    }
    //注销账户
//    @RequestMapping("/deleteUser")
//    public ResultObject<Object> deleteUser(@RequestParam("id") int id) {
//        ResultObject<Object> result = new ResultObject<>();
//        boolean success = userService.deleteUser(id);
//        if (success) {
//            result.setCode(Constant.SUCCESS_RETUEN_CODE);
//            result.setMsg("注销用户成功");
//        } else {
//            result.setCode(Constant.FAILURE_RETUEN_CODE);
//            result.setMsg("注销用户失败");
//        }
//        return result;
//    }

//    @RequestMapping("/getAllUsers")
//    public ResultObject<List<User>> getAllUsers() {
//        ResultObject<List<User>> result = new ResultObject<>();
//        List<User> users = userService.getAllUsers();
//        if (users != null && !users.isEmpty()) {
//            result.setCode(Constant.SUCCESS_RETUEN_CODE);
//            result.setMsg("查询成功");
//            result.setData(users);
//            result.setCount((long) users.size());
//        } else {
//            result.setCode(Constant.FAILURE_RETUEN_CODE);
//            result.setMsg("查询失败或您查询的数据为空");
//            result.setData(new ArrayList<>());
//            result.setCount(0L);
//        }
//
//        return result;
//    }

//    @RequestMapping("/getUserById")
//    public ResultObject<User> getUserById(@RequestParam("id") int id) {
//        ResultObject<User> result = new ResultObject<>();
//        User user = userService.getUserById(id);
//        if (user != null) {
//            result.setCode(Constant.SUCCESS_RETUEN_CODE);
//            result.setMsg("查询成功");
//            result.setData(user);
//        } else {
//            result.setCode(Constant.FAILURE_RETUEN_CODE);
//            result.setMsg("未找到对应的用户");
//        }
//
//        return result;
//    }
}
