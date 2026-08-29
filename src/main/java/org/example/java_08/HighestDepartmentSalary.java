package org.example.java_08;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestDepartmentSalary {
    private String name;
    private String department;
    private int salary;

    public HighestDepartmentSalary(String name, String department, int salary) {
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

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        List<HighestDepartmentSalary> employees = List.of(
                new HighestDepartmentSalary("Akshay", "IT", 50000),
                new HighestDepartmentSalary("Aman", "IT", 70000),
                new HighestDepartmentSalary("Rohit", "Finance", 60000),
                new HighestDepartmentSalary("Sumit", "Finance", 80000),
                new HighestDepartmentSalary("Ankit", "HR", 40000)
        );

        Map<String, Optional<HighestDepartmentSalary>> res = employees
                .stream().collect(Collectors.groupingBy(
                        HighestDepartmentSalary::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(HighestDepartmentSalary::getSalary))
                ));
        res.forEach((dept, emp)->
                System.out.println(dept+":"+emp.get().getName()));

    }
}
