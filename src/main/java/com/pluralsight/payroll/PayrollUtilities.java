package com.pluralsight.payroll;

public class PayrollUtilities {
    public static String timecardToPaycheckCSV(Timecard t){
        return new StringBuilder().append(t.getEmployeeId())
                           .append("|")
                           .append(t.getEmployeeName())
                           .append("|")
                           .append(String.format("%.2f", t.getGrossPay()))
                           .toString();

    }
    public static Timecard timecardFromCSV(String s){
        String[] fields = s.split("\\|");
        Timecard t = new Timecard(
                Integer.parseInt(fields[0]),
                fields[1],   // name is already a String
                Double.parseDouble(fields[2]),
                Double.parseDouble(fields[3]));

        return t;
    }
}
