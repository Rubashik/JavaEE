package com.example.proj1;

public class IncorrectSalaryException extends Exception {

    public IncorrectSalaryException(){
    }
    public IncorrectSalaryException(String msg){
        super(msg);
    }

}
