/*
 * @author vashishth
 * CIS-2571
 * 02/08/2022
 * Logical Operators
 * This program checks if the given integer is divisible by 5 and 6 or not 
 * by using logical operators.
 */

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Enter the integer
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        
        // check if divisible by 5 and 6
        boolean isDivisibleBy5And6 = (integer % 5 == 0 && integer % 6 == 0);
        
        // check if divisible by 5 or 6
        boolean isDivisibleBy5Or6 = (integer % 5 == 0 || integer % 6 == 0);
        
        // check if divisible by 5 or 6 but not by both
        boolean isDivisibleBy5Xor6 =
            (integer % 5 == 0 ^ integer % 6 == 0);
        
        // Printing the Output
        System.out.println( 
            "Is " +  integer + " divisible by 5 and 6? " + isDivisibleBy5And6);
        System.out.println(
            "Is " + integer + " divisible by 5 or 6? " + isDivisibleBy5Or6);
        System.out.println("Is " + integer + 
            " divisible by 5 or 6, but not both? " + isDivisibleBy5Xor6);
    }    
}
