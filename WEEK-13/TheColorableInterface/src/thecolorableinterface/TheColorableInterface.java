/**
 * @author vashishth
 * CIS-2571
 * 04/25/2022
 * The Colorable Interface 
 * This program uses Square, Circle, Rectangle class and displays their area
 * 
 */

package thecolorableinterface;

import java.util.ArrayList;

public class TheColorableInterface {
    public static void main(String[] args) {
        
        // creates an arraylist for Octagon object
        ArrayList<GeometricObject> geometricObjects = new ArrayList<> ();
        
        // adds two circle objects to arraylist
        for(int i = 0; i < 2; i++) {
            // creates the randomvalue for radius 
            double randomValue = (Math.random() * 10 + .5);
            geometricObjects.add(new Circle(randomValue));
        } 
        
        // adds two rectangle objects to arraylist
        for(int i = 0; i < 2; i++) {
            // creates the randomvalue for length and width 
            double randomLen = (Math.random() * 10 + .5);
            double randomWid = (Math.random() * 10 + .5);
            geometricObjects.add(new Rectangle(randomLen,randomWid));
        } 
        
        // adds three square objects to arraylist
        for(int i = 0; i < 3; i++) {
            // creates the randomvalue for side 
            double randomValue = (Math.random() * 10 + .5);
            geometricObjects.add(new Square(randomValue));
        } 
        
        for(int i = 0; i < geometricObjects.size(); i++) {
            System.out.printf("Area of the object is %-6.2f \n",
                    geometricObjects.get(i).getArea());
            // checks if the object is instance of the colorable interface
            if(geometricObjects.get(i) instanceof Colorable){
                Square newSqAtI = (Square) geometricObjects.get(i);
                newSqAtI.howToColor();
            }
        }
        
        // creates an array of five square
        Square squares[]= new Square[5];
        for(int i = 0; i < 5; i++) {
            System.out.println();
            // creates the randomvalue for side 
            double randomValue = (Math.random() * 10 + .5);
            // assign the new square 
            squares[i] = new Square(randomValue);
            //prints the area and perimeter of the square
            System.out.printf("Area of the square #%d is %-6.2f \n",
                    (i+1),squares[i].getArea());
            System.out.printf("Perimeter of the square #%d is %-6.2f \n",
                    (i+1),squares[i].getPerimeter());
        } 
            
    }
}
