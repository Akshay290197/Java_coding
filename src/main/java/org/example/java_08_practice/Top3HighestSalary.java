package org.example.java_08_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/*
* Find the Top 3 Highest-Paid Employees (Intermediate–Advanced)
* Use Java 8 Stream API to find the top 3 highest-paid employees and print their names in descending order of salary.
* */
public class Top3HighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("A", 50000, "IT"),
                new Employee("B", 60000, "HR"),
                new Employee("C", 70000, "IT"),
                new Employee("D", 80000, "Finance"),
                new Employee("E", 55000, "HR")
        );
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName).forEach(System.out::println);
    }
}
