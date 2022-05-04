/*
 * @author vashishth
 * CIS-2571
 * 03/10/2022
 * Locate the smallest element
 * This program ask the user for the matrix and returns the position of the 
 * smallest element in the matrix.
 */

import java.util.Scanner;

public class LocateSmallest {
    public static void main(String[] args) {
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the number of rows: "); 
        int rows = input.nextInt();
        System.out.printf("Enter the number of columns: "); 
        int columns = input.nextInt();
        System.out.println();
        
        // gets the value of the each element in the array
        System.out.println("Enter the array: "); 
        double[][] arr = getArray(rows,columns);
        
        // gets the position of the smallest element as an array
        int[] smallestPosition = locateSmallest(arr);
        
        System.out.println("The location of the smallest element is at (" + 
                smallestPosition[0] + "," + smallestPosition[1] + ")");
        
    }    
    
    public static double[][] getArray(int rows, int columns) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Initialize the array
        double[][] arr = new double [rows][columns];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + (i+1) + " : ");    
            for (int j = 0; j < arr[i].length; j++) { 
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println(); 

        return arr;
    }
    
    public static int[] locateSmallest(double[][] arr) {
        // initialize the smallest position and smallest element 
        int[] position = new int[]{0,0};
        double smallest = arr[0][0];
        
        for (int i = 0; i < arr.length; i++) {  
            for (int j = 0; j < arr[i].length; j++) { 
                //compare if the element at ij to the smallest element
                if(smallest > arr[i][j]) {
                    smallest = arr[i][j]; // changes the smallest element
                    position[0] = i; // change the smallest element's row
                    position[1] = j; // change the smallest element's column
                }
            }
        }
        
        return position;
    }
}