package org.example.java_08_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
* Second-Highest Salary
* Using Java 8 Stream API, find the second-highest distinct salary.
* */
public class SecondHighestDistinctSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("A", 50000, "IT"),
                new Employee("B", 60000, "HR"),
                new Employee("C", 70000, "IT"),
                new Employee("D", 80000, "Finance"),
                new Employee("E", 55000, "HR"),
                new Employee("F", 70000, "HR")
        );
        employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
