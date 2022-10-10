package com.example.proj1;
import java.util.ArrayList;

public class Manager extends Employee{
    double bonus;
    public Manager(String name, double bonus){
        this.id=nextid++;
        this.name=name;
        this.bonus=bonus;
        this.subordinates=new ArrayList<Employee>();
    }
    @Override
    public void PrintEmployee(){
        System.out.println("ID:"+id+" Name:"+name+" Bonus:"+bonus);
    }
}
