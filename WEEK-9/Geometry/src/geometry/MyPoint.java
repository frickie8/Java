/*
 * @author vashishth
 * CIS-2571
 * 03/23/2022
 * MyPoint Class
 * MyPoint Class is used to find the distance between two points and provides 
 * getter and setter methods to get or to set the x and y coordinates.
 */

package geometry;

public class MyPoint {
    
    private double x; //default x coordinate
    private double y; //default y coordinate
    
    // No args Constructor 
    public MyPoint() {
        this(0,0);
    }
    
    // Construct an Account with a specified data 
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // accessors 
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // mutators
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    // others methods
    public double distance(double x, double y) { 
        double distance;
        
        // distance =  sqrt((x-x0)^2 + (y-y0)^2)
        distance = Math.sqrt(Math.pow((this.x - x),2)
                +Math.pow((this.y - y),2));
        
        return distance;
    }
    
    public double distance(MyPoint point){
        double distance;
        
        // getting the x and y coordinate
        double xCoordinate = point.getX();
        double yCoordinate = point.getY();
        
        // distance =  sqrt((x-x0)^2 + (y-y0)^2)
        distance = Math.sqrt(Math.pow((this.x - xCoordinate),2)
                +Math.pow((this.y - yCoordinate),2));
        
        return distance;
    }    
}
