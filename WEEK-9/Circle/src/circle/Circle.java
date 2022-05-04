/**
 * @author vashishth
 * CIS-2571
 * 03/26/2022
 * Circle
 * This program uses Circle2D class to create circle by giving x and y 
 * coordinates in 2D space with given radius and checks contains and overlaps 
 * methods in Circle2D class.
 */

package circle;

public class Circle {
    public static void main(String[] args) {
        
        // Create a circle with (x,y) = (2.0,2.0) and radius = 5.5
        Circle2D c1 = new Circle2D(2.0, 2.0, 5.5);
        System.out.printf("The area of the circle is %-10.2f%n", c1.getArea());
        System.out.printf("The perimeter of the circle is %-10.2f%n",
                c1.getPerimeter());
        System.out.println("The circle contains the point (3.0,3.0) is " +
                c1.contains(3.0, 3.0));
        System.out.println("The circle contains the circle with radius 10.5 and"
                + " center at (4.0,5.0) is " 
                + c1.contains(new Circle2D(4.0, 5.0, 10.5)));
        System.out.println("The circle overlaps the circle with radius 2.3 and"
                + " center at (3.0,5.0) is " 
                + c1.overlaps(new Circle2D(4.0, 5.0, 10.5)));
        System.out.println();
        System.out.println("------Circle------");
        
        Circle2D[] circle = new Circle2D[7];
        
        //create 7 random circle with given bounds
        for(int i = 0; i < 7; i++) {
            if(i == 0) {
                circle[i] = c1;
                continue;
            }
            
            //randomize the coordinate between (-8,8)
            double xCoordinate = (((int) (Math.random() * 1601)) / 100.) - 8;
            double yCoordinate = (((int) (Math.random() * 1601)) / 100.) - 8;
            //randomize the radius between 0.5 to 7
            double radius = (((int) (Math.random() * 651)) / 100.0) + 0.5;
            circle[i] = new Circle2D(xCoordinate,yCoordinate,radius);
            System.out.printf("The circle with radius "
                        + "%4.2f and center at (%4.2f,%4.2f).%n",
                        circle[i].getRadius(),circle[i].getX(),circle[i].getY());
            
        }
        
        // Prints the output
        for(int i = 0; i < 7; i++) {
            System.out.printf("%n%n%n%n%n");
            System.out.printf("The circle with radius "
                    + "%4.2f and center at (%4.2f,%4.2f).%n",
                    circle[i].getRadius(), circle[i].getX(),
                    circle[i].getY());
            for(int count = 0; count < 7; count++) {
                if(count == i) {
                    continue;
                }
                System.out.printf("The circle contains the circle with radius "
                        + "%4.2f and center at (%4.2f,%4.2f) is %b.%n",
                        circle[count].getRadius(),circle[count].getX(),
                        circle[count].getY(),circle[i].contains(circle[count]));
                System.out.printf("The circle overlaps the circle with radius "
                        + "%4.2f and center at (%4.2f,%4.2f) is %b.%n",
                        circle[count].getRadius(), circle[count].getX(),
                        circle[count].getY(),circle[i].overlaps(circle[count]));
                System.out.printf("%n");
            }
        }
    }  
}
