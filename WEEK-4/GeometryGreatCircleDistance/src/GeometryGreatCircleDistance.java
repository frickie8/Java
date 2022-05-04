/*
 * @author vashishth
 * CIS-2571
 * 02/16/2022
 * Geometry - Great Circle Distance
 * This program calculates the distance between two points on the earth by 
 * taking in lattitudes and longitudes of the points.
 */

import java.util.Scanner;

public class GeometryGreatCircleDistance {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Taking in the inputs about the lattitudes and longitudes of the points
        System.out.print("Enter lattiude of point 1 in degrees: ");
        double x1 = input.nextDouble();
        
        System.out.print("Enter longitude of point 1 in degrees: ");
        double y1 = input.nextDouble();
        
        System.out.print("Enter lattiude of point 2 in degrees: ");
        double x2 = input.nextDouble();
        
        System.out.print("Enter longitude of point 2 in degrees: ");
        double y2 = input.nextDouble();
        
        // converting the angles into radians
        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);
        
        // declaring the radius of the earth
        double RADIUS_EARTH = 6371.01;;
        
        // calculating the distance by plugging the given values in the equation
        double d = RADIUS_EARTH * Math.acos(Math.sin(x1Rad) * Math.sin(x2Rad)
                + Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad-y2Rad));
        
        System.out.println("The distance between the two points is "
                + d + " km");
        
    }    
}
