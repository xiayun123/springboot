package com.xiayun.cafe.entity;

import com.xiayun.cafe.enums.UserRoleEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "T_CUSTOMER")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Customer extends User {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Order> orderList;

    @Builder
    public Customer(String name, String password, UserRoleEnum role, List<Order> orderList) {
        super(name, password, role);
        this.orderList = orderList;
    }
}
