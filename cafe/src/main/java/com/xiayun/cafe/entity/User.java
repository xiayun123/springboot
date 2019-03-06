package com.xiayun.cafe.entity;

import com.xiayun.cafe.enums.UserRoleEnum;
import lombok.*;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    private String name;

    private String password;

    private UserRoleEnum role;

}
