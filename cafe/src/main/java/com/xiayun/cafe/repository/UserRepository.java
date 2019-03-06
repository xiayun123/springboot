package com.xiayun.cafe.repository;

import com.xiayun.cafe.entity.User;

import java.util.Optional;

public interface UserRepository {

    <T extends User> Optional<T> findByName(String name);

}
