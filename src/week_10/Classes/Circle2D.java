package week_10.Classes;

public class Circle2D {
    private double x;
    private double y;
    private double radius ;
    public Circle2D (double x,double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle2D(){
        this(0,0,1);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea( ){
        return Math.PI * Math.pow(radius,2);
    }
    public double getPerimeter( ){
        return 2*Math.PI*radius;
    }
    public boolean contains(double x2 , double y2){
        double distance = Math.sqrt((Math.pow(x2-x,2))+Math.pow(y2-y,2));
        return distance<radius;
    }
    public boolean contains(Circle2D circle){
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 =circle.getRadius();
        double distanceOfCenters = Math.sqrt((Math.pow(x2-x,2))+Math.pow(y2-y,2));
        return radius >= (distanceOfCenters+radius2);
    }
    public boolean overLaps(Circle2D circle){
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius = circle.getRadius();
        double distanceOfCenters = Math.sqrt((Math.pow(x2-x,2))+Math.pow(y2-y,2));
        return radius < (distanceOfCenters+radius);

    }
}
