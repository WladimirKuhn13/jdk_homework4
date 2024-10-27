package org.example.service;

import org.example.model.Employee;
import org.example.model.EmployeeDirectory;

import java.util.List;

public class EmployeeService {
    private EmployeeDirectory employeeDirectory = new EmployeeDirectory();

    public Employee createEmployee(List<Long> phonenumber, String name, int experience) {
        int personalNumber = 1000;
        int countEmployees = employeeDirectory.getCountEmployees();
        if (countEmployees == 0) {
            personalNumber = 1;
        } else  {
            personalNumber = countEmployees + 1;
            System.out.println("!!!!!!");
        }
        employeeDirectory.setCountOfEmployees();
        return new Employee(phonenumber, name, experience, personalNumber);
    }
}
