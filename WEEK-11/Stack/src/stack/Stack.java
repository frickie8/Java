/**
 * @author vashishth
 * CIS-2571
 * 04/07/2022
 * Stack
 * This is a test program to check NewStack class.
 */

package stack;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a MyStack
        NewStack stack = new NewStack();

        // Prompt the user to enter five strings
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());	
        }

        // Display in reverse order
        System.out.println("Stack : " + stack.toString());
    } 
}