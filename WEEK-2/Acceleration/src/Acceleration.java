/*
@author vashishth
CIS-2571
02/04/2022
Physics-Acceleration
This program is going to calculate the acceleration by taking in initial and final velocity.
 */

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Taking the input in
        
        // Enter the initial Velocity
        System.out.print("Enter v0, the initial velocity: ");
        double initialVelocity = input.nextDouble();
        
        // Enter the final Velocity
        System.out.print("Enter v1, the final velocity: ");
        double finalVelocity = input.nextDouble();
        
        // Enter the total time required
        System.out.print("Enter t, the time span: ");
        double timeRequired = input.nextDouble();
        
        // Calculationg the acceleration
        double acceleration = ( finalVelocity - initialVelocity ) / timeRequired;
        
        // Printing the Output
        System.out.println("The average acceleration is " + (int)(acceleration * 10000) / 10000.0);
    }
}