package com.capgemini.thr;
import java.util.Scanner;
public class ThrowsDemo {
    public static void main(String[] args) {
        fun1();
        fun2();
    }
      static  void fun1() throws ArithmeticException {
            try {
           int a=10,b=0,c;
                c = a / b;
                System.out.println(c);

            } catch (ArithmeticException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
        static void fun2() throws ArrayIndexOutOfBoundsException {
            try {
                int[] ar = new int[3];
                for (int i = 0; i <= ar.length - 1; i++) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("enter array elements");
                    ar[i] = scan.nextInt();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println(ar[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }

        }


