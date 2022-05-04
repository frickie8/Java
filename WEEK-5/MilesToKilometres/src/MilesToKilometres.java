/*
 * @author vashishth
 * CIS-2571
 * 02/24/2022
 * Conversion from Miles to Kilometres
 * This program converts the miles into kilometres and represent in tabular 
 * manner.
 */

public class MilesToKilometres {
    public static void main(String[] args) {        
        // Declaring the constants
        final double MILES_TO_KILOMETERS = 1.609;
        final double KILOMETERS_TO_MILES = 1/1.609;
        
        // Print the Table Heading
        System.out.printf("%-10s %-9s | %-12s %-6s",
                    "Miles", "Kilometers", "Kilometers" , "Miles");
        System.out.println();
        
        // Print table body and aligning the table, and also rounding the 
        // float values to 3 decimal places.
        for (int i = 1, j = 20; i <= 10; i++, j+=5) {
            System.out.printf("%-12d %6.3f   |  %-11d %6.3f",
                    i, i * MILES_TO_KILOMETERS, j , j * KILOMETERS_TO_MILES);
            System.out.println();
        }
    }
}