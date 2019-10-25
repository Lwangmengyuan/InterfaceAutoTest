package com.practice.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void groupsServerTest1(){
        System.out.println("这是服务器分组测试方法1");
    }

    @Test(groups = "server")
    public void groupsServerTest2(){
        System.out.println("这是服务器分组测试方法2");
    }

    @Test(groups = "client")
    public void groupsClientTest1(){
        System.out.println("这是客户端分组测试方法1");
    }

    @Test(groups = "client")
    public void groupsClientTest2(){
        System.out.println("这是客户端分组测试方法2");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("这是组执行之前执行的BeforeGroups");
    }

    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("这是组执行之后执行的AfterGroups");
    }
}