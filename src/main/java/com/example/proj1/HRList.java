package com.example.proj1;

import java.util.ArrayList;

public class HRList {
    private ArrayList<Employee> workers = new ArrayList<>();

    static HRList instance = null;

    private HRList() {
    }

    public static HRList getInstance() {
        if (instance == null) {
            instance = new HRList();
        }
        return instance;
    }

    public void addWorker(Employee emp) throws EmployeeInRegistryExc {
        if (workers.contains(emp)) {
            throw new EmployeeInRegistryExc("Employee already in list");
        } else {
            workers.add(emp);
        }
    }

    public void toStringList() {
        for (Employee emp : workers) {
            emp.PrintEmployee();
        }
    }
}
