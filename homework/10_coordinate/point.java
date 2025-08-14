public class Point{
    // Instance variables

    private double x,y;

    // Constructors

    // Initialize this Point with the xVal and yVal parameters
    public Point(double xVal, double yVal){
        x = xVal;
        y = yVal;
    }

    // Initialize this Point with other Point's values
    public Point(Point other){
        x = other.getX();
        y = other.getY();
    }

    // Getters

    public double getX(){ 
        return x;
    }
    public double getY(){
        return y;
    }

    
    // Print the coordinate like this "(5.0, 3.0)"

    public String toString(){
        
        return "(" + x + ", " + y + ")";
    }

    /*
    Write distance method
    */
    public static double distance(Point a, Point b){
       
        return Math.pow((Math.pow(a.getX() - b.getX(), 2 ) + Math.pow(a.getY() - b.getY(), 2)), 0.5);
    }

    /*
    The parameter list is different from distance method
    Do not duplicate your code
    Reuse code from prior methods
    */
    public double distanceTo(Point other){
        return distance(this,other);
    }
}
