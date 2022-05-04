/*
 * @author vashishth
 * CIS-2571
 * 02/15/2022
 * Check Substring
 * This program checks whether the second string is a
 * substring of the first string.
 */

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Enter the first string
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        
        // Enter the second string
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();
        
        // checks whether the second string is a substring of the first string.
        boolean checkSubstring = (s1.toUpperCase()).contains(s2.toUpperCase());
                 
        // Printing out the statement.
        if(checkSubstring)
            System.out.println( s2 + " is a substring of " + s1 );
        else 
            System.out.println(  s2 + " is a not substring of " + s1);
    }
}