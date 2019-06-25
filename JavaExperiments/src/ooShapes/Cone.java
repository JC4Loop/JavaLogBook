package ooShapes;

public class Cone extends Shape3d implements ShapeCircular{
    private double bottomDiameter;
    private double bottomRadius;
    
    public Cone(double height,double width){
        super(height,width,height,2); // in the case of cone height and depth are same
        bottomDiameter = width; // width is also diameter of circular surface.
        bottomRadius = ShapeCircular.diameterToRadius(bottomDiameter);
    }
    
    @Override
    public double getVolume() {
        return PI * (bottomRadius * bottomRadius) * (height / 3.0);
    }

    @Override
    public void rollShape() {
        ShapeCircular.super.rollShape();
    }

    @Override
    public double getRadius() {
        return bottomRadius;
    }

    @Override
    public double getDiameter() {
        return bottomDiameter;
    }
}