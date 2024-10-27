package org.example.controller;

import org.example.model.Employee;
import org.example.service.EmployeeDirectoryService;

import java.util.List;

public class EmployeeDirectoryController {
    private EmployeeDirectoryService employeeDirectoryService = new EmployeeDirectoryService();

    public List<Employee> findEmployeesByExperience (int experience) {
        return employeeDirectoryService.findEmployeesByExperience(experience);
    }

    public List<Long> findPhoneNumberByName (String name) {
        return employeeDirectoryService.findPhoneNumberByName(name);
    }

    public Employee findEmployeeByPersonalNumber(int personalNumber) {
        return employeeDirectoryService.findEmployeeByPersonalNumber(personalNumber);
    }

    public void addNewEmployee(Employee employee) {
        employeeDirectoryService.addNewEmployee(employee);
    }

    public void showAllEmployees() {
        employeeDirectoryService.showAllEmployees();
    }
}
