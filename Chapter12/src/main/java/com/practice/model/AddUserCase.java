package com.practice.model;

import lombok.Data;

@Data
public class AddUserCase {
    private String username;
    private String password;
    private int sex;
    private int age;
    private int permission;
    private int is_delete;
    private String expected;
}
