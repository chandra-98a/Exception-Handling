package com.capgemini.mistake;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        for (i=0;i<=a.length-1;i++){
            System.out.println("enter the elements");
            a[i]=scan.nextInt();
        }
        try {
            for (i = 0; i <= 10; i++) {
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Problem in accessing the array");
        }
        System.out.println("exiting main normally");
    }
}
