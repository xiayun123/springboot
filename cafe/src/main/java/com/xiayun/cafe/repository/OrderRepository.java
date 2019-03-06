package com.xiayun.cafe.repository;

import com.xiayun.cafe.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
