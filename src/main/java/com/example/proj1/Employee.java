package com.example.proj1;

public class Employee {
    private int id;
    private static int nextid=0;
    private String name;

    public Employee(String name) throws FieldLenghtException {
        this.id=nextid++;
        if(name.length()>15){
            throw new FieldLenghtException("Too much symbols");
        }

        else{this.name=name;}
    }
    void PrintEmployee(){
        System.out.println("ID:"+id+" Name:"+name);
    }


}
