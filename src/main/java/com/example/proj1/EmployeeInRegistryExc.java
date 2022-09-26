package com.example.proj1;

public class EmployeeInRegistryExc extends Exception{
    EmployeeInRegistryExc(){
    }
    EmployeeInRegistryExc(String msg){
        super(msg);
    }

}
