package com.practice.model;

import lombok.Data;

@Data
public class LoginModel {
    private int id;
    private String username;
    private String password;
    private String expected;
}
