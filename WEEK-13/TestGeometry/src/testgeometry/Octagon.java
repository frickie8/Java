/**
 * 
 * Octagon class uses GeometricObject as parent class and implements Comparable
 * and Cloneable 
 * 
 */

package testgeometry;

public class Octagon extends GeometricObject
    implements Comparable<Octagon>, Cloneable {
    
    // data fields
    private double side;   

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // I checked the formula for area of octagon is (2 + 2sqrt(2)) * side * side
    @Override
    public double getArea() {
        return (2 + (2 * Math.sqrt(2))) * side * side;
    }

    // return 8 * side
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    // check if the side is greater than, less than or equals to given Octagon
    @Override
    public int compareTo(Octagon o) {
        if (getSide() > o.getSide())
            return 1;
        else if (getSide() < o.getSide())
            return -1;
        else
            return 0;
    }
    
    // if compareTo method returns == 0 then they both are equal
    @Override
    public boolean equals(Object o) {
        return this.compareTo((Octagon) o) == 0;
    }
    
    @Override
    /**
     * Override the protected clone method defined in the Object class, and
     * strengthen its accessibility
     */
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    
    @Override // Implement the toString method in GeometricObject
    public String toString() { 
        return "Side: " + String.format("%.2f", getSide()) +
                " Area: " + String.format("%.2f", getArea());
    }
}   