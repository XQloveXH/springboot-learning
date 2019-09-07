package com.zxq.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
