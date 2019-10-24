package com.imooc.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ParameterOnDataProvider {

    @Test(dataProvider = "data1")
    public void test1(String name, int age){
        System.out.println("name=" + name + " ; age=" + age);
    }

    @DataProvider(name = "data1")
    public Object[][] dataProvider1(){
        Object[][] data = new Object[][]{
                {"jack",15}
        };
        return data;
    }

    @Test(dataProvider = "data2")
    public void test2(String name, int age){
        System.out.println("name=" + name + " ; age=" + age);
    }

    @Test(dataProvider = "data2")
    public void test3(String name, int age){
        System.out.println("name=" + name + " ; age=" + age);
    }

    @DataProvider(name = "data2")
    public Object[][] dataProvider2(Method method){
        Object[][] data2 = null;
        if(method.getName().equals("test2")){
            data2 = new Object[][]{
                    {"zaizai",3}
            };
        }else if(method.getName().equals("test3")){
            data2 = new Object[][]{
                    {"dongdong",10}
            };
        }
        return data2;
    }
}
