package com.capgemini.ducking;

public class Demo {
    void fun1(){
        System.out.println("entering into fun1");
        fun2();
    }

    void fun2(){
        System.out.println("entering into fun2");
        int a,b,c;
        a=10;
        b=0;
        c=a/b;
        System.out.println("the value of c is "+c);
    }
}
