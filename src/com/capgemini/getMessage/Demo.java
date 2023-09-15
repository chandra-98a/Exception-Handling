package com.capgemini.getMessage;

public class Demo {
    public static void main(String [] args){
        int a,b,c;
        a=10;b=0;
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("Exiting main");
    }
}
