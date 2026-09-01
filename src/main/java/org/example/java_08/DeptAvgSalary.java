package org.example.java_08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptAvgSalary {
    private String name;
    private String dept;
    private int salary;

    public DeptAvgSalary(String name, String dept, int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        List<DeptAvgSalary> deptAvgSalaries = List.of(
                new DeptAvgSalary("Akshay","IT", 50000),
                new DeptAvgSalary("Sumit", "JCB", 48000),
                new DeptAvgSalary("Aman", "OYO", 29000),
                new DeptAvgSalary("Rohit", "Finance", 70000)
        );

        Map<String, Double> stringIntegerMap = deptAvgSalaries.stream()
                .collect(Collectors.groupingBy(
                        DeptAvgSalary::getDept,
                        Collectors.averagingInt(DeptAvgSalary::getSalary)
                ));
        stringIntegerMap.forEach((dept,salary)->{
            System.out.println(dept+":"+salary);
        });

    }
}
