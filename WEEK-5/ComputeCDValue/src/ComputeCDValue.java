/*
 * @author vashishth
 * CIS-2571
 * 02/25/2022
 * Financial Application - Compute CD Value
 * This program calculates maturity CD Value with given Annual rate, Maturity 
 * period and the principal amount. It displays the output in tabular manner by
 * displaying CD value after each passed month upto End date.
 */

import java.util.Scanner;

public class ComputeCDValue {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Taking in the inputs about initial deposit, annual percentage and 
        // time frame for the deposit
        System.out.print("Enter the initial deposit amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter annual percentage yield: ");
        double apr = input.nextDouble();
        
        System.out.print("Enter maturity period (number of months): ");
        int timePeriod = input.nextInt();
        
        // coverting the annual rate to monthly rate to show monthly changes
        double monthlyRate = apr / 12.00;
        
        // initializing the deposit
        double deposit = principal;
        
        // Print the Table heading
        System.out.println();
        System.out.printf("%-6s %10s", "Month", "CD Value");
        System.out.println();
        
        // Print table body and aligning the table, and also rounding the 
        // float values to 2 decimal places.
        for (int i = 1; i <= timePeriod; i++) {
            deposit = deposit + (deposit * monthlyRate / 100.00);
            System.out.printf("%-6d %10.2f", i, deposit);
            System.out.println();
        }
    }    
}
