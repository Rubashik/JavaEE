package com.example.proj1;

public class Main {
    public static void main(String[] args) {
        try{
        Employee emp=new Employee("Ivan", "Ruban", -2);
        emp.PrintEmployee();
        }catch(FieldLenghtException ex){
            System.out.println(ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Employee emp=new Employee("Ivan", "Ruban", 5555);
            emp.PrintEmployee();
        }catch(FieldLenghtException ex){
            System.out.println(ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }

        try{
            Employee emp=new Employee("Ivan", "Ruban1dsfseferert", -2);
            emp.PrintEmployee();
        }catch(FieldLenghtException ex){
            System.out.println(ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
