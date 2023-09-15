package com.capgemini.custom;

import java.util.Scanner;

public class Demo {
    public static void main(String []args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = scanner.nextInt();
        System.out.println("Enter the value of b");
        b = scanner.nextInt();
        try {
            if (a > b) {
                c = a - b;
                System.out.println(c);
            } else {
                throw new ALessThanBException();
            }
        } catch (ALessThanBException e) {
            System.out.println("Subtraction not possible");
            System.out.println(e.getMessage());
        }
        System.out.println("Exiting main normally");
    }
}
