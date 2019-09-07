package com.zxq.controller;

import com.zxq.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private User user;
    @RequestMapping("properties")
    @ResponseBody
    public User getUserByProperties(){
        user.setName("朱小强");
        return user;
    }
}
