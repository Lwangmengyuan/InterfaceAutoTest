package com.imooc;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void test1(){
        System.out.println("这是异常测试方法test1");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void test2(){
        System.out.println("这是异常测试方法test2");
        throw new RuntimeException();
    }
}