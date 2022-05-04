/**
 * @author vashishth
 * CIS-2571
 * 03/26/2022
 * Circle2D class
 * This program creates Circle2D class to create circles in 2D space and 
 * checks if points or circle contains in given circle or intersects with the 
 * given circle.
 */

package circle;

public class Circle2D {
    
    private double x; 
    private double y; 
    private double radius;
    
    //no args constructor
    public Circle2D() {
        this(0.0,0.0,1.0);
    }
    
    //constructor
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // accessors
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // mutators
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // other methods
    
    /**
     * Return the area of the Circle
     */
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Return the perimeter of the Circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    /**
     * Returns true if the specified point (x, y) is inside this circle
     */
    public boolean contains(double x, double y) {
        // checks if it satisfies the circles (x-x0)^2+(y-y0)^2 < R^2
        if((Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2))
                < Math.pow(this.radius, 2)){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Returns true if the specified circle is inside this circle
     */
    public boolean contains(Circle2D circle) {
        double distance;
        
        // distance between both centers 
        distance = Math.sqrt(Math.pow((this.x - circle.getX()),2)
                +Math.pow((this.y - circle.getY()),2));
        
        // checks if distance between centers + circle radius is smaller than 
        // given circle
        if((distance + circle.getRadius() < this.radius)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Returns true if the specified circle overlaps with this circle
     */
    public boolean overlaps(Circle2D circle) {
        double distance;
        
        // distance between both centers 
        distance = Math.sqrt(Math.pow((this.x - circle.getX()),2)
                +Math.pow((this.y - circle.getY()),2));
        
        // checks if both circles deos not contains each other 
        // and shortest distance between is smaller than sum of their radiis
        if(!(this.contains(circle)) && 
                !(circle.contains(this)) &&
                (distance <= circle.getRadius() + this.radius)) {
            return true;
        }
        else {
            return false;
        }
    }  
}
