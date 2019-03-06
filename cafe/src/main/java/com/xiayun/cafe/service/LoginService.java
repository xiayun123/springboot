package com.xiayun.cafe.service;

import com.xiayun.cafe.entity.Customer;

public interface LoginService {

    Customer loginCustomer(String name, String password);

    Customer regCustomer(String name, String password);

}
