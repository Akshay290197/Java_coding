package org.example.rev;

import org.example.java_08_practice.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithHighestAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("A", 50000, "IT"),
                new Employee("B", 60000, "HR"),
                new Employee("C", 70000, "IT"),
                new Employee("D", 80000, "Finance"),
                new Employee("E", 55000, "HR")
        );
        employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
