package Composite;

import java.util.ArrayList;

public class Manager extends Employee{
    double bonus;

    Manager(String name,String dept){
        this.id=nextid++;
        this.name=name;
        this.dept=dept;
        this.subordinates=new ArrayList<Employee>();
    }

    @Override
    public void PrintEmpoyee(){
        System.out.println("Manager :[ Name : " + name + ", dept : " + dept + "]: managerID:"+manid);
    }
}