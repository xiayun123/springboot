package com.xiayun.cafe.controller;

import com.xiayun.cafe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cafe")
public class CafeController {

    private final LoginService loginService;

    @Autowired
    public CafeController(LoginService loginService) {
        this.loginService = loginService;
    }


    @RequestMapping("/test")
    public String test() {
        return "hello my cafe!";
    }

    @RequestMapping("/regCustomer")
    public String regCustomer(String name, String password) {
        return loginService.regCustomer(name, password).toString();
    }

    @RequestMapping("/loginCustomer")
    public String loginCustomer(String name, String password) {
        return loginService.loginCustomer(name, password).toString();
    }

}
