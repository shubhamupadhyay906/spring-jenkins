package com.example.jenkins.testing;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shubham", 13, 120000));
        employees.add(new Employee("Ravi", 14, 1100));
        employees.add(new Employee("Raj", 15, 100000));
        employees.add(new Employee("Harsh", 16, 150000));
        return employees.stream().map(Driver::getEmployee).toList();
    }

    public static void main(String[] args) {
        getEmployee().forEach(System.out::println);
    }

    private static Employee getEmployee(Employee employee) {
        if (employee.getAge() > 14) {
            employee.setSalary(employee.getSalary() * 1.10);
        }
        return employee;
    }
}
