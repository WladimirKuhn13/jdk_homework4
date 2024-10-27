package org.example.view;

import org.example.controller.EmployeeController;
import org.example.controller.EmployeeDirectoryController;
import org.example.model.Employee;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDirectoryView {
    private EmployeeDirectoryController employeeDirectoryController = new EmployeeDirectoryController();
    private EmployeeController employeeController = new EmployeeController();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Поиск сотрудников по стажу");
            System.out.println("2. Получить список телефонов сотрудника");
            System.out.println("3. Поиск сотрудника по табельному номеру");
            System.out.println("4. Добавить нового сотрудника");
            System.out.println("5. Показать список всех сотрудников");
            System.out.println("0. Выход");

            switch (scanner.nextInt()) {
                case 1 -> findEmployeesByExperience();
                case 2 -> findPhoneNumberByName();
                case 3 -> findEmployeeByPersonalNumber();
                case 4 -> addNewEmployee();
                case 5 -> showAllEmployees();
                case 0 -> System.exit(0);

                default -> System.out.println("Операция не поддерживается!");
            }
        }
    }

    public void findEmployeesByExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стаж: ");
        int experience = scanner.nextInt();
        System.out.println(employeeDirectoryController.findEmployeesByExperience(experience));
    }

    public void findPhoneNumberByName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println(employeeDirectoryController.findPhoneNumberByName(name));
//        return employeeDirectoryController.findPhoneNumberByName(name);
    }

    public void findEmployeeByPersonalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите табельный номер сотрудника: ");
        int personalNumber = scanner.nextInt();
        System.out.println(employeeDirectoryController.findEmployeeByPersonalNumber(personalNumber));
    }

    public void addNewEmployee() {
        List<Long> phoneNumbers = new ArrayList<>();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника: ");
        String name = scanner.nextLine();
        System.out.println("Введите стаж сотрудника: ");
        int experience = scanner.nextInt();
        while (flag) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить номер телефона");
            System.out.println("2. Закончить добавление номеров");
            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Введите номер телефона: ");
                long phoneNumber = scanner.nextLong();
                phoneNumbers.add(phoneNumber);
            } else if (action == 2) {
                break;
            } else {
                System.out.println("Операция не поддерживается");
            }
        }
        employeeDirectoryController.addNewEmployee(employeeController.createEmployee(phoneNumbers, name, experience));
    }

    public void showAllEmployees() {
        employeeDirectoryController.showAllEmployees();
    }
}
