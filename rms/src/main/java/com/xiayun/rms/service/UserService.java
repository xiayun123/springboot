package com.xiayun.rms.service;

import com.xiayun.rms.entity.User;

public interface UserService {

    User registerByPhone(String phone, String password);

    User registerByEmail(String email, String password);

    User login(String loginName, String password);

    User editProfile(User user);

    Boolean usernameValidate(String username);

    Boolean phoneValidate(String username);

    Boolean emailValidate(String username);
}
