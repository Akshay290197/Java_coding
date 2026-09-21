package org.example.java_08_practice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Find the Highest Salary Employee (Intermediate)
* Use Java 8 Stream API to find the employee with the highest salary.
* */
public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A", 55000, "IT"),
                new Employee("B", 65000, "GSD"),
                new Employee("C", 70000, "SSD"),
                new Employee("D", 80000, "BSD")
        );

        employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
    }
}
