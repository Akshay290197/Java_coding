package org.example.java_08_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeWithSecondHighestDistinctSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("A", 50000, "IT"),
                new Employee("B", 60000, "HR"),
                new Employee("C", 70000, "IT"),
                new Employee("D", 80000, "Finance"),
                new Employee("E", 70000, "HR")
        );
        double secondHighestSalary = employees.stream().map(Employee::getSalary).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0);
        // employee with this salary
        employees.stream().filter(n->n.getSalary()==secondHighestSalary)
                .findFirst().ifPresent(System.out::println);
    }
}

