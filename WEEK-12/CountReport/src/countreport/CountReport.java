/**
 * @author vashishth
 * CIS-2571
 * 04/15/2022
 * Count Report
 * This program asks user to input the file name and then counts the characters,
 * words and lines in the file and outputs in the file "countreport.txt".
 */

package countreport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountReport {

    public static void main(String[] args) throws FileNotFoundException {
        
        // getting the file
        System.out.print("Enter the file name : ");
        
        Scanner input = new Scanner(System.in);
        File dataFile = new File(input.next());
        
        if (!dataFile.exists()) {
            System.out.println("Data file " + dataFile.getName() + " does not exist");
            System.exit(1);
        }
        
        
        try (PrintWriter output = new PrintWriter("countreport.txt")){
            
            Scanner inputFile = new Scanner(dataFile);
            
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            
            do {
                String line = inputFile.nextLine();
                // it removes the whitespace from the string
                charCount += line.replace(" ", "").length();
                // it count whitespaces and add 1 to it
                wordCount += ((line.length() - line.replace(" ", "").length()) + 1);
                lineCount++;
            } while (inputFile.hasNextLine());
            
            // output 
            System.out.println("The file " + dataFile.getName() + " has");
            System.out.println(charCount + " Characters");
            System.out.println(wordCount + " Words");
            System.out.println(lineCount + " Lines");
                    
            // Write formatted output to the file
            output.println("The file " + dataFile.getName() + " has");
            output.println(charCount + " Characters");
            output.println(wordCount + " Words");
            output.println(lineCount + " Lines");
        }
    }    
}