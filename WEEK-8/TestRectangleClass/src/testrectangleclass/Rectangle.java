/*
 * @author vashishth
 * CIS-2571
 * 03/10/2022
 * Rectangle Class
 * This class is used for main class, this class provides method to calculate 
 * the area and perimeter of given width and height. It also have default 
 * constructor if nothing is given as an input.
 */

package testrectangleclass;

public class Rectangle {
    
    double width = 1.0;  //default width
    double height = 1.0; //default height
    
    /* No args Constructor */
    Rectangle() {
    }

    /** Construct a rectangle with a specified width and height */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /** Return the area of this rectangle */
    double getArea() {
        return width * height;
    }
    
    /** Return the perimeter of this rectangle */
    double getPerimeter() {
        return 2 * (width + height);
    }
}
