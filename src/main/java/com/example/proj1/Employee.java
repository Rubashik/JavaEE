package com.example.proj1;

public class Employee {
    private int id;
    private static int nextid=0;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws FieldLenghtException, IncorrectSalaryException {
        this.id=nextid++;
        if(name.length()>12){
            throw new FieldLenghtException("Too much symbols in name");
        }

        else{this.name=name;}

        if(surname.length()>15){
            throw new FieldLenghtException("Too much symbols in surname");
        }

        else{this.surname=surname;}

        if(salary<0){
            throw new IncorrectSalaryException("Incorrect salary");
        }

        else{this.salary=salary;}

    }
    void PrintEmployee(){
        System.out.println("ID:"+id+" Name:"+name+" Surname: "+surname+" Salary: "+salary);
    }


}
