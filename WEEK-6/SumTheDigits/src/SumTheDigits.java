/*
 * @author vashishth
 * CIS-2571
 * 03/05/2022
 * Sum the digits in a number 
 * This program ask the user for a number and then adds each digit and returns 
 * the sum.
 */

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
           
        // Taking in the input as an integer
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        
        System.out.println("The sum of the digit of number " +
                num + " is " + sumDigits(num)); //printing the sum
        
        input.nextLine(); // to skip the previous line
        // Taking in the input as a string
        System.out.print("Enter a number: ");
        String s = input.nextLine();
        
        System.out.println("The sum of the digit of number " +
                s + " is " + sumDigits(s)); //printing the sum
    }
    
    public static int sumDigits(long n) {
        int length = (int)(Math.log10(n) + 1); // finds the length of the num
        int sum = 0;
        
        // adds each digit to the sum
        for (int i = 0; i < length; i++) {
            int rem = (int) (n % 10) ; // gets the last digit
            n = n / 10 ; // removes the last digit
            sum += rem;
        }
        
        return sum;
    }
    
    public static int sumDigits(String n) {
        int sum = 0;
        
        // adds each digit to the sum
        for (int i = 0; i < n.length(); i++) {
            char c =  n.charAt(i);
            int singleDigit = Character.getNumericValue(c);
            sum += singleDigit;
        }
        
        return sum;
    }
    
}
