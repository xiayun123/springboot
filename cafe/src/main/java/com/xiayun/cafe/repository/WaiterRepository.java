package com.xiayun.cafe.repository;

import com.xiayun.cafe.entity.Waiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaiterRepository extends JpaRepository<Waiter, Long>, UserRepository {
}
