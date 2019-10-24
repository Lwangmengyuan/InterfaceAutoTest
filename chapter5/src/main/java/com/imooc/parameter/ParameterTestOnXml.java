package com.imooc.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestOnXml {

    @Test
    @Parameters({"Name","Age"})
    public void test(String name, int age){
        System.out.println("name=" + name + " ; age=" + age);
    }
}