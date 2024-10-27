package org.example.controller;

import org.example.model.Employee;
import org.example.service.EmployeeService;

import java.util.List;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    public Employee createEmployee (List<Long> phoneNumber, String name, int experience) {
        return employeeService.createEmployee(phoneNumber, name, experience);
    }
}
