/*
 * @author vashishth
 * CIS-2571
 * 03/10/2022
 * Statistics: compute deviation
 * This program ask the user for the size of the data array and also lower and 
 * higher bound of the data and then generates an array data provided and 
 * returns the mean and deviation of the data array.
 */

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the number of values in the data set: "); 
        int size = input.nextInt();
        System.out.printf("Enter the low value in the set: "); 
        double low = input.nextDouble();
        System.out.printf("Enter the high value in the set: "); 
        double high = input.nextDouble();
        System.out.println();
        
        System.out.println("The " + size + " random values are: ");
        
        double range = (high - low); // range of the random data
        double[] x = new double[size]; // creates an array of provided size
        
        for(int i = 0; i < x.length; i++){
            // shifts the random data to lower bound
            x[i] = (Math.random() * range) + low; 
            // prints the random data
            System.out.printf("%6.2f", x[i]);
            // checks if there are 10 elements in the line 
            if((i+1) % 10 == 0 && i != 0) 
                System.out.println();
        }
        System.out.println();
        
        // calculates the mean of the array
        double meanArray = mean(x); 
        // calculates the deviation of the array
        double deviationArray = deviation(x); 
                
        System.out.printf("The mean is %-7.2f", meanArray); 
        System.out.println();
        System.out.printf("The standard deviation is %-7.2f", deviationArray); 
        System.out.println();
        
    }         
    
    // takes a double array and finds its mean by summing each and dividing it 
    // by the number of elements
    public static double mean(double[] arr) {
        double mean, sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        
        mean = sum / (arr.length) ;
        
        return mean;        
    }
    
    // calculates the deviation of the array
    public static double deviation(double[] arr) {
        
        // calling the mean method to the find of the array to calculate the
        // deviation
        double mean = mean(arr), sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = Math.pow((arr[i] - mean), 2);
        }
        
        double deviation = Math.sqrt((sum/(arr.length -1)));
        
        return deviation;        
    }
}