package com.xiayun.cafe.repository;

import com.xiayun.cafe.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, UserRepository {
}
