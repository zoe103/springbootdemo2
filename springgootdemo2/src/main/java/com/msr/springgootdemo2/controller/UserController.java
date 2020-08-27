package com.msr.springgootdemo2.controller;

import com.msr.springgootdemo2.domain.User;
import com.msr.springgootdemo2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2.controller
 * @date 2020/8/26 15:48
 * @Copyright © 株式会社多言语系统研究所
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
