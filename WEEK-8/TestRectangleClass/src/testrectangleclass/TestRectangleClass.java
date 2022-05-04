/*
 * @author vashishth
 * CIS-2571
 * 03/10/2022
 * Locate the smallest element
 * This program uses rectangle class and create object and print details about
 * the object like width, height, area, perimeter.
 */

package testrectangleclass;

public class TestRectangleClass {
    public static void main(String[] args) {

        // Create a rectangle with width = 4 and height = 40
        Rectangle rectangle1 = new Rectangle(4,40);
        printDetails(rectangle1);
        System.out.println();

        // Create a rectangle with width = 3.5 and height = 35.9
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        printDetails(rectangle2);
    }
    
    // This method prints out the details about the given rectangle
    public static void printDetails(Rectangle givenRectangle) {

        System.out.printf("The width of the rectangle is %-10.2f",
                givenRectangle.width);
        System.out.println();
        System.out.printf("The height of the rectangle is %-10.2f", 
                givenRectangle.height);
        System.out.println();
        System.out.printf("The area of the rectangle is %-10.2f",
                givenRectangle.getArea());
        System.out.println();
        System.out.printf("The perimeter of the rectangle is %-10.2f",
                givenRectangle.getPerimeter());
        System.out.println();
    }
}