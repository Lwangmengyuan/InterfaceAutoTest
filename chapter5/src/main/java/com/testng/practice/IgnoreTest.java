package com.testng.practice;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = true)
    public void test1(){
        System.out.println("这是测试方法test1");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("这是测试方法test2");
    }
}
