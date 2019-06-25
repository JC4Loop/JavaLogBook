package ooShapes;

public abstract class Shape2d extends Shape {
    protected final int sides;
    
    public Shape2d(int s, double h, double w){
        super(h,w);
        this.sides = s;
    }
    
    public abstract double getArea2d();
}
