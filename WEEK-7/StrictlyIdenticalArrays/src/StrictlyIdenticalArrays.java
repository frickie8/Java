/*
 * @author vashishth
 * CIS-2571
 * 03/09/2022
 * Strictly Identical Arrays
 * This program ask the user for two matrices and compares and returns the 
 * output as identical if they strictly identical.
 */

import java.util.Scanner;

public class StrictlyIdenticalArrays {
    public static void main(String[] args) {
        
        System.out.println("Enter array 1:"); 
        int[][] arr1 = getArray();
        System.out.println("Enter array 2:"); 
        int[][] arr2 = getArray();
        
        boolean identical = equals(arr1,arr2);
        
        if(identical)
            System.out.println("The two arrays are strictly identical");
        else
            System.out.println("The two arrays are NOT strictly identical");
            
    } 
    
    public static int[][] getArray() {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Initialize the array
        int[][] arr = new int[3][3];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + (i+1) + " : ");    
            for (int j = 0; j < arr[i].length; j++) { 
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(); 

        return arr;
    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        
        //Check whether element at m1[i][j] is equal to m2[i][j]    
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                if(m1[row][column] != m2[row][column])
                    return false;
            }
        }

        return true; //If every elements are equal then return true
    }
}