package com.capgemini.underAgeoverAge;

public class OverAgeException extends Exception{
    public String getMessage(){
        return "Your age is greter than 60, DL cannot be given";
    }
}
