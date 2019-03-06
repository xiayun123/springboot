package com.xiayun.cafe.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_ORDER")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<Coffee> coffeeList;

    @ManyToOne(fetch = FetchType.LAZY)
    private Waiter waiter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
