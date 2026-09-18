package org.example.rev;

import org.example.java_08.DeptAvgSalary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    Employee(String name, String dept, int salary){
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String getDept(){
        return dept;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Akshay","IT", 50000),
                new Employee("Sumit", "JCB", 48000),
                new Employee("Aman", "IT", 29000),
                new Employee("Rohit", "JCB", 70000)
        );
        Map<String, Integer> salaries = new HashMap<>();
        Map<String, Integer> employeeCount = new HashMap<>();
        for(Employee employee:employeeList){
            String dept = employee.getDept();
            int salary = employee.getSalary();
            salaries.put(dept, salaries.getOrDefault(dept,0)+salary);
            employeeCount.put(dept, employeeCount.getOrDefault(dept,0)+1);
        }
        for(String dept : salaries.keySet()){
            double averageSalary = (double) salaries.get(dept) / employeeCount.get(dept);
            System.out.println(dept+":"+averageSalary);
        }
    }
}
