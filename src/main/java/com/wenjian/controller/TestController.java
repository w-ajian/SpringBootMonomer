package com.wenjian.controller;

import com.wenjian.entityclass.User;
import com.wenjian.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> testController(){

        return userMapper.queryUserList();

    }

}
