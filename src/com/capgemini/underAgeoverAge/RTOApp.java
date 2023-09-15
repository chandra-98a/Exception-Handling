package com.capgemini.underAgeoverAge;

import java.util.Scanner;

public class RTOApp {
    public static void main(String [] args){
        dispatchDL();
    }
    static void dispatchDL(){
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException();
            } else if (age>60) {
                throw new OverAgeException();
            }
            else{
                System.out.println("Please collect your DL");

            }
        }
        catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }
        catch (OverAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
