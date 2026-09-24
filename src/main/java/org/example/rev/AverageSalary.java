package org.example.rev;

import org.example.java_08_practice.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A", 55000, "IT"),
                new Employee("B", 65000, "GSD"),
                new Employee("C", 70000, "SSD"),
                new Employee("D", 80000, "BSD")
        );
        double avg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);
    }
}
