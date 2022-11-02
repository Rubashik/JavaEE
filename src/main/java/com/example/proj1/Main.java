package com.example.proj1;

public class Main {
    public static void main(String[] args) {
        HRList hr = HRList.getInstance();
        try {
            Employee emp = new Employee("Ivan", "Ruban", -213);
            hr.addWorker(emp);
            hr.toStringList();
        } catch (FieldLenghtException ex) {
            System.out.println(ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println(ex.getMessage());
        } catch (EmployeeInRegistryExc ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Manager emp2 = new Manager("Anton", 200);
            hr.addWorker(emp2);
            hr.toStringList();
        } catch (EmployeeInRegistryExc ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----Exception check------");
        try {
            Manager emp2 = new Manager("Anton", 200);
            hr.addWorker(emp2);

        } catch (EmployeeInRegistryExc ex) {
            System.out.println(ex.getMessage());
        } finally {
            hr.toStringList();
        }

    }
}
