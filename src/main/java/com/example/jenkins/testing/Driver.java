package com.example.jenkins.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/app")
public class Driver {

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shubham", 13, 120000));
        employees.add(new Employee("Ravi", 14, 1100));
        employees.add(new Employee("Raj", 15, 100000));
        employees.add(new Employee("Harsh", 16, 150000));
        return employees.stream().map(Driver::getEmployee).toList();
    }

    private static Employee getEmployee(Employee employee) {
        if (employee.getAge() > 14) {
            employee.setSalary(employee.getSalary() * 1.10);
        }
        return employee;
    }
}
