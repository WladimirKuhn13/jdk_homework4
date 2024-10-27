package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    List<Employee> listOfEmployees;
    int countOfEmployees;

    public EmployeeDirectory() {
        this.listOfEmployees = new ArrayList<>();
        this.countOfEmployees = 0;
    }

    public int getCountEmployees() {
        return countOfEmployees;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setCountOfEmployees() {
        countOfEmployees++;
    }
}
