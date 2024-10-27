package org.example.service;

import org.example.model.Employee;
import org.example.model.EmployeeDirectory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectoryService {
    private EmployeeDirectory employeeDirectory = new EmployeeDirectory();

    public List<Employee> findEmployeesByExperience (int experience) {
        List<Employee> listOfEmployees = new ArrayList<>();
        for (Employee employee : employeeDirectory.getListOfEmployees()) {
            if (employee.getExperience() == experience) {
                listOfEmployees.add(employee);
            }
        }
        return listOfEmployees;
    }

    public List<Long> findPhoneNumberByName (String name) {
        List<Long> listNumbersEmployee = new ArrayList<>();
        for (Employee employee : employeeDirectory.getListOfEmployees()) {
            if (employee.getName().equals(name)) {
                listNumbersEmployee = employee.getPhoneNumber();
            }
        }
        return listNumbersEmployee;
    }

    public Employee findEmployeeByPersonalNumber(int personalNumber) {
        for (Employee employee : employeeDirectory.getListOfEmployees()) {
            if (employee.getPersonalNumber() == personalNumber) {
                return employee;
            }
        }
        return null;
    }

    public void addNewEmployee(Employee employee) {
        employeeDirectory.getListOfEmployees().add(employee);
    }

    public void showAllEmployees() {
        for (Employee employee : employeeDirectory.getListOfEmployees()) {
            System.out.println(employee);
        }
    }

}
