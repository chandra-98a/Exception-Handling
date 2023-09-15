package com.capgemini.error;

public class SOT {
    void fun1()
    {
        System.out.println("Inside fun1");
        fun2();
    }
    void fun2(){
        System.out.println("Inside fun2");
        fun1();
    }
    void fun3(){
        System.out.println("Inside fun3");
    }
}

