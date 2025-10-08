package com.pluralsight.payroll;

public class Timecard {
    private int employeeId;
    private String employeeName;
    private double hours;
    private double hourlyPayRate;

    public Timecard(int employeeId, String employeeName, double hours, double hourlyPayRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hours = hours;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getHours() {
        return hours;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getGrossPay(){
        return hourlyPayRate * hours;
    }


}
