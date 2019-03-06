package com.xiayun.cafe.service.impl;

import com.xiayun.cafe.entity.Customer;
import com.xiayun.cafe.enums.UserRoleEnum;
import com.xiayun.cafe.repository.CustomerRepository;
import com.xiayun.cafe.repository.WaiterRepository;
import com.xiayun.cafe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    private final CustomerRepository customerRepository;
    private final WaiterRepository waiterRepository;

    @Autowired
    public LoginServiceImpl(CustomerRepository customerRepository, WaiterRepository waiterRepository) {
        this.customerRepository = customerRepository;
        this.waiterRepository = waiterRepository;
    }


    @Override
    public Customer loginCustomer(String name, String password) {

        Optional<Customer> customer = customerRepository.findByName(name);
        if (customer.isPresent() && customer.get().getPassword().equals(password)) {
            return customer.get();
        } else {
            throw new RuntimeException("user not exist!");
        }
    }

    @Override
    public Customer regCustomer(String name, String password) {
        Customer customer = Customer.builder()
                .name(name)
                .password(password)
                .role(UserRoleEnum.Customer)
                .orderList(new ArrayList<>())
                .build();
        if (customerRepository.save(customer) != null) {
            return customer;
        } else {
            throw new RuntimeException("user register failure!");
        }
    }
}
