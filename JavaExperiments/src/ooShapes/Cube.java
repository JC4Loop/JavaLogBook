package ooShapes;

public class Cube extends Shape3d{
    
    public Cube(double v){
        super(v,v,v,6);
        // surfaces = 6
    }

    @Override
    public double getVolume() {
        return height * width * depth;
    }
}
