package org.example.java_08;

import org.example.rev.Employee;

import java.util.HashMap;
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


        // without java 8
//        Map<String, Integer> salaries = new HashMap<>();
//        Map<String, Integer> employeeCount = new HashMap<>();
//        for(Employee employee:employeeList){
//            String dept = employee.getDept();
//            int salary = employee.getSalary();
//            salaries.put(dept, salaries.getOrDefault(dept,0)+salary);
//            employeeCount.put(dept, employeeCount.getOrDefault(dept,0)+1);
//        }
//        for(String dept : salaries.keySet()){
//            double averageSalary = (double) salaries.get(dept) / employeeCount.get(dept);
//            System.out.println(dept+":"+averageSalary);
//        }

    }
}
