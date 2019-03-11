package com.xiayun.rms.service.impl;

import com.xiayun.rms.entity.User;
import com.xiayun.rms.repository.UserRepository;
import com.xiayun.rms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerByPhone(String phone, String password) {
        User user = User.builder()
                .phone(phone)
                .password(password)
                .username(phone)
                .build();
        return userRepository.save(user);
    }

    @Override
    public User registerByEmail(String email, String password) {
        User user = User.builder()
                .email(email)
                .password(password)
                .username(email)
                .build();
        return userRepository.save(user);
    }

    @Override
    public User login(String loginName, String password) {
        Optional<User> user = userRepository.findByUsername(loginName);
        if (!user.isPresent()) {
            user = userRepository.findByPhone(loginName);
            if (!user.isPresent()) {
                user = userRepository.findByEmail(loginName);
            }
        }
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("用户名或密码错误！");
        }
    }

    @Override
    public User editProfile(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean usernameValidate(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    @Override
    public Boolean phoneValidate(String phone) {
        return userRepository.findByPhone(phone).isPresent();
    }

    @Override
    public Boolean emailValidate(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
