/*
 * @author vashishth
 * CIS-2571
 * 02/10/2022
 * Palindrome number
 * This program checks if the given integer is Palindrome number or not.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Enter the integer
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();
        
        // Divide the integer by 100 and set quotient to be hundreds place
        int hundreds = num / 100;
        
        // Divide the integer by 10 and set remainder to be units place
        int units = num % 10 ;
        
        // check if divisible by 5 or 6
        boolean palindromeNumber = (hundreds == units);
        
        // Printing the Output
        if(palindromeNumber)
            System.out.println( num + " is a palindrome. ");
        else 
            System.out.println( num + " is not a palindrome. ");
        
    }
}
