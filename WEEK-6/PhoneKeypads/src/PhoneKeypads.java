/*
 * @author vashishth
 * CIS-2571
 * 02/25/2022
 * Financial Application - Compute CD Value
 * This program asks the phone number as a string and returns the phone number 
 * with digits. 
 */


import java.util.Scanner;

public class PhoneKeypads {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Taking in the inputs for the phone number
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        
        String number =""; // Initialize the output string
        
        // Transform the string to a number
        for (int i = 0; i < s.length(); i++) {
            // convert string to char to get value through getNUmber Method
            char atIndex = s.toUpperCase().charAt(i); 
            if( atIndex >= 'A' && atIndex <= 'Z') {
                number += getNumber(atIndex); //adding number to new string
                continue;
            }
            number += atIndex; 
        }
        
        // Print the output as a phone number
        System.out.println(number);
    }
    
    public static int getNumber(char uppercaseletter) {
        //comparing characters and changing it to numbers
        if(uppercaseletter >= 'A' && uppercaseletter <= 'C')
          return 2;
        else if(uppercaseletter >= 'D' && uppercaseletter <= 'F')
          return 3;
        else if(uppercaseletter >= 'G' && uppercaseletter <= 'I')
          return 4;
        else if(uppercaseletter >= 'J' && uppercaseletter <= 'L')
          return 5;
        else if(uppercaseletter >= 'M' && uppercaseletter <= 'O')
          return 6;
        else if(uppercaseletter >= 'P' && uppercaseletter <= 'S')
          return 7;
        else if(uppercaseletter >= 'T' && uppercaseletter <= 'V')
          return 8;
        else
          return 9;
    }
}