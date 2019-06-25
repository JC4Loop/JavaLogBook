package ooShapes;

public class Sphere extends Shape3d implements ShapeCircular{
    private double diameter;
    private double radius;
    
    public Sphere(double depth){
        super(depth,depth,depth,1); // Sphere has same height width and depth
        this.diameter = depth;
        this.radius = ShapeCircular.diameterToRadius(diameter);
    }
    
    @Override
    public double getVolume() {
        // 4 / 3 must be put as double values, otherwise int is returned
        //      giving wrong calculation
        return (4.0/3.0) * PI * (radius * radius * radius);
    }

    @Override
    public double getDiameter() {
        return diameter;
    }

    @Override
    public double getRadius() {
        return radius;
    }
    
}
