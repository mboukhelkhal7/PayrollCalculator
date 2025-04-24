package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for input and output file names
        System.out.print("Enter the name of the employee file to process: ");
        String inputFile = input.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFile = input.nextLine();

        List<Employee> employees = PayrollReader.readEmployee(inputFile);

        //if (outputFile.toLowerCase().endsWith(".json")){

        //}else {

        for (Employee employee : employees) {
            PayrollReader.writeFile(employee, outputFile);
        }

        //}
       // System.out.println("Payroll file created: " + outputFile);
        //input.close();
    }
}