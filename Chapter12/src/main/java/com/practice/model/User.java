package com.practice.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int sex;
    private int age;
    private int permission;
    private int is_delete;

    @Override
    public String toString(){
        return ("{id:"+id+","+
                "username:"+username+","+
                "password:"+password+","+
                "sex:"+sex+","+
                "age:"+age+","+
                "permission:"+permission+","+
                "is_delete:"+is_delete+"}");
    }
}
