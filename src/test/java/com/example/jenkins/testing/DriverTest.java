package com.example.jenkins.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest {

    @Test
    void testEmployeesSize() {
        List<Employee> employee = Driver.getEmployee();
        assertEquals(4, employee.size());
    }

    @Test
    void testEmployeeAge() {
        List<Employee> employee = Driver.getEmployee();
        assertEquals(13, employee.get(0).getAge());
        assertEquals(14, employee.get(1).getAge());
        assertEquals(15, employee.get(2).getAge());
    }

    @Test
    void testEmployeeName() {
        List<Employee> employee = Driver.getEmployee();
        assertEquals("Shubham", employee.get(0).getName());
        assertEquals("Ravi", employee.get(1).getName());
        assertEquals("Raj", employee.get(2).getName());
    }

}