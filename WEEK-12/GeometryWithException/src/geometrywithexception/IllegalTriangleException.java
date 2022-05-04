/**
 * Exception class for Triangle class
 */
package geometrywithexception;

class IllegalTriangleException extends Exception {
    // 
    private double side1;
    private double side2;
    private double side3;

    /**
     * Construct an exception if any two sides' sum is not smaller than other side 
     */
    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Invalid sides " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // if the input is negative
    public IllegalTriangleException(double side) {
        super("Invalid side " + side);
        
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
}
