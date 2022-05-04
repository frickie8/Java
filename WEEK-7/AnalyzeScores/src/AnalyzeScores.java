/*
 * @author vashishth
 * CIS-2571
 * 03/09/2022
 * Analyze Scores
 * This program ask the user for scores and then adds each scores and returns  
 * the count for high and low elemnents compared to the average.
 */

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        double[] scores = new double[100]; //initializing the array of size 100
        double sum = 0;  // initialize sum to calculate the average
        int count =0; // count the non-negative number 
        
        for(int i = 0; i < scores.length; i++){
            System.out.print("Enter the score for " + (i+1) + " : ");
            scores[i] = input.nextDouble();
            if(scores[i] < 0) // breaks the loop if negative number entered
                break;
            sum += scores[i]; 
            count++;
        }
        
        double avg = sum / count; //Avg = sum / valid entries
        
        // initializing the count for highs and lows
        int countLow = 0;   
        int countHigh = 0;
        int countEqual = 0;
        
        for(int i = 0; i < count; i++){
            
            if(scores[i] < avg)
                countLow++;
            else if(scores[i] > avg)
                countHigh++;
            else
                countEqual++;
        }
        
        System.out.println("The count of elements which are lower than the "
                + "average is " + countLow);
        System.out.println("The count of elements which are higher than the "
                + "average is " + countHigh);
        System.out.println("The count of elements which are equal to the "
                + "average is " + countEqual);
    }    
}