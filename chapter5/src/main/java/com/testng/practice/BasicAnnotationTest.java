package com.testng.practice;

import org.testng.annotations.*;

public class BasicAnnotationTest {
    @Test
    public void test1(){
        System.out.println("这是测试方法test1");
    }

    @Test
    public void test2(){
        System.out.println("这是测试方法test2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法执行之前执行的BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法执行之后执行的AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类执行之前执行的BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类执行之后执行的AfterClass");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("这是在测试执行之前执行的BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("这是在测试执行之后执行的AfterTest");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是在测试套执行之前执行的BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是在测试套执行之后执行的AfterSuite");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("这是在组执行之前执行的BeforeGroups");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("这是在组执行之后执行的AfterGroups");
    }
}