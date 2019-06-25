package ooShapes;

public abstract class Shape3d extends Shape {
    protected double depth;
    protected final int surfaces;
    
    public Shape3d(double h, double w, double d, int surfaces){
        super(h,w);
        this.depth = d;
        this.surfaces = surfaces;
    }
    
    public abstract double getVolume();
}

