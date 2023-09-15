package com.capgemini.ducking;

public class Demo1 {
    public static void main(String[] args){
        Demo d1=new Demo();
        try {
            d1.fun1();
        }
        catch (Exception e){
            System.out.println("Exception caught in main method");
        }
        System.out.println("Exiting main normally");
    }
}
