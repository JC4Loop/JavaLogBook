package ooShapes;

public interface ShapeCircular {

    /** PI is the ratio of a circles circumference to its diameter,
     * Constant value.
     */
    final static double PI = Math.PI;
    
    static double diameterToRadius(double diameter){
        return diameter / 2;
    }
    
    default void rollShape(){
        System.out.println("Shape is rolling");
    }
    
    public double getRadius();
    public double getDiameter();
}
