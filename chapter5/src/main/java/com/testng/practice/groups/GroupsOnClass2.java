package com.testng.practice.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {

    public void student2(){
        System.out.println("这是GroupsOnClass2中的方法student2");
    }
}