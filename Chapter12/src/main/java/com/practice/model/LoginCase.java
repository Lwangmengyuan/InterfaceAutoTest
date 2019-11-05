package com.practice.model;

import lombok.Data;

@Data
public class LoginCase {
    private String username;
    private String password;
    private String expected;
}
