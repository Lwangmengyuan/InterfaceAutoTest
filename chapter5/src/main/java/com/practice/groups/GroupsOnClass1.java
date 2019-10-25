package com.practice.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {

    public void student1(){
        System.out.println("这是GroupsOnClass1中的方法student1");
    }
}