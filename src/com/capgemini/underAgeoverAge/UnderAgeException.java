package com.capgemini.underAgeoverAge;

public class UnderAgeException extends Exception{
    public String getMessage(){
        return "your age is less than 18 DL cannot be issued";
    }
}
