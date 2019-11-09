package com.practice.model;

import lombok.Data;

@Data
public class GetUserInfoModel {
    private int id;
    private int user_id;
    private String username;
    private String expected;
}
