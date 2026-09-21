package org.example.java_08_practice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Find the Average Salary (Intermediate)
 * Use Java 8 Stream API to calculate the average salary of all employees using Collectors.averagingDouble().
 * */
public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A", 55000, "IT"),
                new Employee("B", 65000, "GSD"),
                new Employee("C", 70000, "SSD"),
                new Employee("D", 80000, "BSD")
        );
        double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avgSalary);
    }
}
