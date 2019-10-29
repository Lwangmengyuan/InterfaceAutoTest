package com.testng.practice.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 5,threadPoolSize = 3)
    public void multiThreadOnAnnotion(){
        System.out.println("multiThreadOnAnnotionTest");
        System.out.printf("Thread id is : %s%n",Thread.currentThread().getId());
    }
}