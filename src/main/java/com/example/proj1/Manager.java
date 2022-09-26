package com.example.proj1;

public class Manager extends Employee{
    double bonus;
    public Manager(String name, double bonus){
        this.id=nextid++;
        this.name=name;
        this.bonus=bonus;
    }
    @Override
    public void PrintEmployee(){
        System.out.println("ID:"+id+" Name:"+name+" Bonus:"+bonus);
    }
}
