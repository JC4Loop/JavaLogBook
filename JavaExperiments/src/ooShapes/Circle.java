package ooShapes;

public class Circle extends Shape2d implements ShapeCircular{
    private double diameter;
    private double radius;
    
    private Circle(double h, double w){
        super(1,h,w); /* super must be first line in constructor
                        don't want to call super without calculating
                        height and width.
                        Therefore static method 'CreateCircle' is used
        */
    }             
    
    public double getDiameter(){
        return diameter;
    }
    
    public double getRadius(){
        return radius;
    }
    
    /**
     * Create circle object with 1 parameter, diameter.
     * Method will use diameter to calculate height and width.
     * @param double diameter
     * @return instance of Circle Class
     */
    public static Circle CreateCircle(double diameter){
        double height = diameter;
        double width = diameter;
        Circle circle = new Circle(height,width);
        circle.diameter = diameter;
        circle.radius = ShapeCircular.diameterToRadius(diameter);
        return circle;
    }

    @Override
    public double getArea2d() {
        return  PI * (this.radius * this.radius);
    }
}
