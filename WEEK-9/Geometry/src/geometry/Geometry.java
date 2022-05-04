/*
 * @author vashishth
 * CIS-2571
 * 03/23/2022
 * Finding the distance between two points
 * This program uses MyPoint class to create points in 2D space and 
 * finds distance between them.
 */

package geometry;

public class Geometry {
    public static void main(String[] args) {
        
        //initializing two points
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10,30.5);
        
        // printing out the points and distance between them
        System.out.println("Point A : (" + a.getX() + "," + a.getY() + ")");
        System.out.println("Point B : (" + b.getX() + "," + b.getY() + ")");
        System.out.printf("The distance between two points is %-7.2f",
                b.distance(a));
        System.out.println();
        System.out.printf("The distance between two points is %-7.2f",
                b.distance(0, 0));
        System.out.println();
    }    
}
