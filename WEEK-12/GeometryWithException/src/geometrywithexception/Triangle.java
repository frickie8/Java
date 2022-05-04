/**
 * @author vashishth
 * CIS-2571
 * 04/16/2022
 * Triangle class
 * This class creates triangle class and throws exception for invalid inputs 
 * or if the does not follow the rules of triangle.
 */

package geometrywithexception;

public class Triangle extends GeometricObject {
    
    // default data attributes
    private double side1;   
    private double side2;  
    private double side3;
    
    //no args constructor
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    /**
     * Construct a triangle with the specified sides
     * @param side1
     * @param side2
     * @param side3
     * @throws geometrywithexception.IllegalTriangleException
     */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        
        // if any two sides sum is not smaller than or equal to left side then it is exception and will not work further
        if((side1 <= (side2 + side3))
                || (side2 <= (side1 + side3))
                || (side3 <= (side1 + side2)))
            throw new IllegalTriangleException(side1, side2, side3);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3); 
    }

    //accessors
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // mutators which throws exceptions for invalod input
    private void setSide1(double side1) throws IllegalTriangleException {
        if(side1 >= 0)
            this.side1 = side1;
        else
            throw new IllegalTriangleException(side1);
    }

    private void setSide2(double side2) throws IllegalTriangleException {
        if(side2 >= 0)
            this.side2 = side2;
        else
            throw new IllegalTriangleException(side2);
        
    }

    private void setSide3(double side3) throws IllegalTriangleException {
        if(side3 >= 0)
            this.side3 = side3;
        else
            throw new IllegalTriangleException(side3);
        
    }

    /**
     * getArea method 
     * @return sqrt(s * (s-a) * (s-b) * (s-c)) where s = (a + b + c)/2 
     */
    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * getPerimeter method 
     * @return side1 + side2 + side3
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = "
                + side2 + " side3 = " + side3;
    }
}
