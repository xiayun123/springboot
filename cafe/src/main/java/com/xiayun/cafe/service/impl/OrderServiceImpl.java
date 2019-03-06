package com.xiayun.cafe.service.impl;

import com.xiayun.cafe.entity.Order;
import com.xiayun.cafe.repository.OrderRepository;
import com.xiayun.cafe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order placeOrder() {

        return null;
    }
}
