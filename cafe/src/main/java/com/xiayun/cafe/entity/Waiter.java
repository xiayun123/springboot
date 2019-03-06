package com.xiayun.cafe.entity;

import com.xiayun.cafe.enums.UserRoleEnum;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "T_WAITER")
@Data
@EqualsAndHashCode(callSuper = true)
public class Waiter extends User {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "waiter")
    private List<Order> orderList;

    @Builder
    public Waiter(String name, String password, UserRoleEnum role, List<Order> orderList) {
        super(name, password, role);
        this.orderList = orderList;
    }
}
