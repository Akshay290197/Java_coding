package org.example.java_08_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
* Group Employees by Department (Intermediate)
* Use Java 8 Stream API and Collectors.groupingBy() to group employees by department.
* */
public class GroupEmployeesByDept {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A", 55000, "SSD"),
                new Employee("B", 65000, "GSD"),
                new Employee("C", 70000, "SSD"),
                new Employee("D", 80000, "GSD")
        );

        employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName, Collectors.toList()
                        ))).forEach((k,v)-> System.out.println(k+":"+v));
    }
}
