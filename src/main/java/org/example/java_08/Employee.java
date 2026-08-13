package org.example.java_08;

import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Akshay","IT", 50000),
                new Employee("Sumit", "JCB", 48000),
                new Employee("Aman", "OYO", 29000),
                new Employee("Rohit", "Finance", 70000)
        );

        String name = employees.stream().max(Comparator.comparingInt(Employee::getSalary))
                .map(Employee::getName)
                .orElse(null);

        System.out.println(name);

    }
}
