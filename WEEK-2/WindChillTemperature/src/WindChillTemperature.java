
import java.util.Scanner;

/*
@author vashishth
CIS-2571
02/04/2022
Physics-Acceleration
This program is going to calculate the wind-chill temperature by taking in Temperature and velocity
*/

public class WindChillTemperature {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        // Taking the input in
        
        //Enter the temperature in Fahrenheit
        System.out.print(
                "Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        
        //Enter the wind speed
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        //Calculate the wind-chill temperature
        double windChill = 35.74 + ( 0.6215 * temperature ) 
                - ( 35.75 * Math.pow(windSpeed,0.16) ) 
                + ( 0.4275 * temperature * Math.pow(windSpeed,0.16) );
        
        // Printing the Output
        System.out.println(
                "The wind chill index is " + (int)(windChill * 100000)
                        / 100000.0);
    }
}
