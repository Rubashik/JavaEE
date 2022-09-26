package com.example.proj1;

import java.util.Objects;

public class Employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String name, String surname, double salary) throws FieldLenghtException, IncorrectSalaryException {
        this.id = nextid++;
        if (name.length() > 12) {
            throw new FieldLenghtException("Too much symbols in name");
        } else {
            this.name = name;
        }

        if (surname.length() > 15) {
            throw new FieldLenghtException("Too much symbols in surname");
        } else {
            this.surname = surname;
        }

        if (salary < 0) {
            throw new IncorrectSalaryException("Incorrect salary");
        } else {
            this.salary = salary;
        }

    }

    public Employee() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public void PrintEmployee() {
        System.out.println("ID:" + id + " Name:" + name + " Surname: " + surname + " Salary: " + salary);
    }


}
