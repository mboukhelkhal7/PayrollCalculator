package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollReader {

    public static List<Employee> readEmployee(String filename){

        List<Employee> employeeList = new ArrayList<>();

        // step1 try and catch
        // step 2 read the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            //skip the first line
            reader.readLine();
            String line;

            // create a loop

            while ((line = reader.readLine()) !=null){
                 // 3 split the line into individual fields

                String[] part = line.split("\\|");

                //4 assigning each item of the list to its variable

                int id = Integer.parseInt(part[0]);
                String name = part[1];
                double hoursWorked = Double.parseDouble(part[2]);
                double payRate = Double.parseDouble(part[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                employeeList.add(employee);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return employeeList;

    }
    public static void writeFile(Employee employee, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(employee.displayInfo());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
