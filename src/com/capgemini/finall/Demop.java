package com.capgemini.finall;

public class Demop {
    void fun1() {
        System.out.println("fun1 connected to DB");
        try {
            fun2();
        } catch (Exception e) {
            System.out.println("Exception caught in fun1");
            throw e;
        } finally {
            System.out.println("Closing DB connected by fun1");
        }
    }

    void fun2() {
        System.out.println("fun2 connected to DB");
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception caught in fun2");
            throw e;
        } finally {
            System.out.println("closing DB connected by fun2");
        }
    }

}