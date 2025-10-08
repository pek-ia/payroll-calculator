package com.pluralsight.payroll;

import java.io.*;

public class PayrollApp {
    public static void main(String[] args) {
        // Open timecards input file
        // Open paychecks output file
        String timecardsFilename = "timecards.csv";
        String paychecksFilename = "paychecks.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(timecardsFilename));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(paychecksFilename))) {

            String input = "";
            bufferedReader.readLine();  // Skip the first line

            // Read and write the records
            while ( (input = bufferedReader.readLine()) != null){
                Timecard t = PayrollUtilities.timecardFromCSV(input);
                bufferedWriter.write(PayrollUtilities.timecardToPaycheckCSV(t) + "\n");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
