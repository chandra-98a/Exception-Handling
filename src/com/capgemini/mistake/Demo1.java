package com.capgemini.mistake;

import java.util.Scanner;

public class Demo1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value for a");
        a=scan.nextInt();
        System.out.println("enter the value for b");
        b=scan.nextInt();

        c=a/b;

        System.out.println("the value of c is "+c);
        System.out.println("Exiting main normally");
    }
}
