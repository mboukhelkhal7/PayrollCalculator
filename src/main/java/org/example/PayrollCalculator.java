package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PayrollCalculator {
    public static void main(String[] args) {

        List<Employee> employees = PayrollReader.readEmployee("employees.csv");

        for (Employee employee : employees) {
            employee.displayInfo();
        }

    }
}