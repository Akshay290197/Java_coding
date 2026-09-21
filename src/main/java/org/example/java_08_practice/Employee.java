package org.example.java_08_practice;


public class Employee {
    private String name;
    private double salary;
    private String department;
    Employee(String name, double salary, String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    private String getDepartment(){
        return department;
    }
}
