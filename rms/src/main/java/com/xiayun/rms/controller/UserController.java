package com.xiayun.rms.controller;

import com.xiayun.rms.entity.User;
import com.xiayun.rms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/regByPhone")
    public User registerByPhone(String phone, String password) {
        return userService.registerByPhone(phone, password);
    }

    @RequestMapping("/login")
    public User login(String loginName, String password) {
        return userService.login(loginName, password);
    }

    @RequestMapping("/editProfile")
    public User editProfile(User user) {
        return userService.editProfile(user);
    }


}
