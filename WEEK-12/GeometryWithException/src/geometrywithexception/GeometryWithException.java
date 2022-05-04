/**
 * @author vashishth
 * CIS-2571
 * 04/16/2022
 * Geometry with exception handling
 * This program checks the triangle class and also using the illegalTriangleException
 * to throw exceptions.
 */

package geometrywithexception;

import java.util.Scanner;

public class GeometryWithException {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // ask the color for the object
        System.out.print("What is the color of the object: ");
        String color = input.next();
        
        // ask the user if the object is filled
        System.out.print("Is the object filled with color(true/false): ");
        boolean filled = input.nextBoolean();
        
        // start the loop
        boolean continueInput = true;
        do{ 
            try {
                
                // prompt the user for sides of the triangle
                System.out.print("Enter the side 1 of the triangle: ");
                double length1 = input.nextDouble();
                System.out.print("Enter the side 2 of the triangle: ");
                double length2 = input.nextDouble();
                System.out.print("Enter the side 3 of the triangle: ");
                double length3 = input.nextDouble();
                
                Triangle t1 = new Triangle(length1, length2, length3);
                
                t1.setColor(color);
                t1.setFilled(filled);
                System.out.println(t1.toString());
                System.out.println("Area : " + t1.getArea());
                System.out.println("Perimeter : " + t1.getPerimeter());
                System.out.println("Color : " + t1.getColor());
                System.out.println("Triangle is " + (t1.isFilled() ? "" : " not ")
                        + "filled.");
                
                continueInput = false;
            }
            catch(IllegalTriangleException ex){
                System.out.println("Try again. (Incorrect input: an positive "
                        + "number is required)");
                input.nextDouble();
            }
            catch(IllegalTriangleException ex){
                System.out.println("Try again. (Incorrect input: an positive "
                        + "number is required)");
                input.nextDouble();
            }
            
        }while(continueInput);
        
    }    
}
