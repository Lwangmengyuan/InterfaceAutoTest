package com.practice.model;

import lombok.Data;

@Data
public class GetUserInfoCase {
    private int user_id;
    private String username;
    private String expected;
}
