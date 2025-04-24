package org.example;

public class Employee {

    private int id;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int id, String name, double hoursWorked, double payRate){

        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;


    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(){
        return hoursWorked * payRate;
    }

    public String displayInfo(){
        return String.format("%d| %s| %.2f\n", id, name, getGrossPay());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", gross pay ='" + getGrossPay() + '\'' +
                '}';
    }
}
