package com.imooc;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("这是依赖测试的方法test1");
//        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("这是依赖测试的方法test2");
    }
}