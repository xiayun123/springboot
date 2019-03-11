package com.xiayun.rms.entity;

import com.xiayun.rms.enums.UserRoleEnum;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column(nullable = false)
    private String username = "";

    @Column(nullable = false)
    private String password = "";

    private UserRoleEnum role = UserRoleEnum.Cashier;

    private Boolean gender = true;

    private String phone = "";

    private String email = "";

    private String address = "";

}
