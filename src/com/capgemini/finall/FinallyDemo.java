package com.capgemini.finall;

public class FinallyDemo
{
    public static void main(String[] args){
        System.out.println("Main connected to db");
        Demop dp=new Demop();
        try{
            dp.fun1();
        }
        catch (Exception e){
            System.out.println("Exception caught in main");
        }
        finally {
            System.out.println("closing db connected by main");
        }
    }
}
