package Composite;

import java.util.ArrayList;

public class HRlist {
    private ArrayList<Employee> workers = new ArrayList<Employee>();

    static HRlist instance = null;

    private HRlist(){}

    public static HRlist getInstance(){
        if (instance == null)
            instance = new HRlist();

        return instance;
    }
    public void addWorker(Employee emp){
        workers.add(emp);
    }
    public void toStringList(){
        for(Employee emp:workers){
            emp.PrintEmpoyee();}
    }
}
