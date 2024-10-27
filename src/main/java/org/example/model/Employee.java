package org.example.model;

import java.util.List;

public class Employee {
    private int personalNumber;
    private List<Long> phoneNumber;
    private String name;
    private int experience;

    public Employee(List<Long> phoneNumber, String name, int experience, int personalNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
        this.personalNumber = personalNumber;
    }

    public int getExperience() {
        return experience;
    }

    public List<Long> getPhoneNumber() {
        return phoneNumber;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return personalNumber + " " + phoneNumber + " " + name + " " + experience;
    }
}
