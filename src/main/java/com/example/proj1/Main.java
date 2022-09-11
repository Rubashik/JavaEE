package com.example.proj1;

public class Main {
    public static void main(String[] args) {
        try{
        Employee emp=new Employee("Ivan");
        emp.PrintEmployee();
        }catch(FieldLenghtException ex){
            System.out.println(ex.getMessage());
        }
    }
}
