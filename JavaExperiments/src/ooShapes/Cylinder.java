package ooShapes;

public class Cylinder extends Shape3d implements ShapeCircular{
    private double diameter;
    private double radius;
    
    private Cylinder(double h, double w, double depth){
        super(h,w,depth,3);
    }
    
    public static Cylinder CreateCylinder(double diameter, double depth){
        double height = diameter;
        double width = diameter;
        Cylinder cylinder = new Cylinder(height,width,depth);
        cylinder.diameter = diameter;
        cylinder.radius = ShapeCircular.diameterToRadius(diameter);
        return cylinder;
    }

    @Override
    public double getVolume() {
        return  depth * (PI * (this.radius * this.radius));
    }

    @Override
    public double getDiameter() {
        return diameter;
    }
    
    @Override
    public double getRadius(){
        return radius;
    }
}
