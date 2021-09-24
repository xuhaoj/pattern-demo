package com.xhj.pattern.template.jdbc;


import lombok.Data;

@Data
public class Member {

    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;

    private String roleName;

}