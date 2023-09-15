package com.capgemini.prevFinally;

public class Demo {
    public static void main(String [] args){
        int a=10,b=5,c=a/b;
        try{
            System.out.println("try executed");
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("catch block executed");
            throw e;
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
