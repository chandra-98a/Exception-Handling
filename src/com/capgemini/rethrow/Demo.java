package com.capgemini.rethrow;

public class Demo {
    void fun1(){
        System.out.println("entering into fun1");
        try {
            fun2();
        }
        catch (Exception e){
            System.out.println("Exception caught in fun1");
            throw e;
        }
    }

    void fun2(){
        System.out.println("entering into fun2");
        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("the value of c is " + c);
        }
        catch (Exception e){
            System.out.println("Exception caught in fun2");
            throw e;
        }
    }
}
