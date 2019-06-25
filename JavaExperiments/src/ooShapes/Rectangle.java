package ooShapes;

public class Rectangle extends Shape2d {
    public Rectangle(double h, double w){
        super(4,h,w);
    }

    @Override
    public double getArea2d() {
        return height * width;
    } 
}
