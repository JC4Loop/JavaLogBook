package ooShapes;

//Cuboid (right rectangular prism
public class Cuboid extends Shape3d {
 
 public Cuboid(double h, double w, double d){
     super(h, w, d, 6);
 }

 @Override
 public double getVolume() {
     return height * width * depth;
 }
}
