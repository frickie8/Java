/**
 * Square class is child class of the GeometricObject class and it implements 
 * Colorable interface
 */

package thecolorableinterface;

public class Square extends GeometricObject implements Colorable{
    
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    /**
     * Return side
     */
    public double getSide() {
        return side;
    }

    /**
     * Set a new side
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    /**
     * Return area
     */
    public double getArea() {
        return side * side;
    }

    @Override
    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    /**
     * prints Color all four sides.
     */
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
