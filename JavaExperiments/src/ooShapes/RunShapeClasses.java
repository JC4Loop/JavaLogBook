package ooShapes;

public class RunShapeClasses {

    public static void main(String[] args) {   
        Triangle triangle1 = new Triangle(18.4,20);
        outputMsg(triangle1);
        
        Triangle triangle2 = Triangle.CreateTriangleGiven3SideLengths(10, 12, 14);
        outputMsg(triangle2);
        
        Rectangle rectangle1 = new Rectangle(20.2,50);
        outputMsg(rectangle1);
        
        Circle circle = Circle.CreateCircle(24);
        outputMsg(circle);
        
        Cylinder cylinder1 = Cylinder.CreateCylinder(20, 10);
        outputMsg(cylinder1);
        
        Sphere sphere1 = new Sphere(20);
        outputMsg(sphere1);
        
        Cone cone1 = new Cone(10,20);
        outputMsg(cone1);
        
        Cube cube1 = new Cube(12);
        outputMsg(cube1);
 
        
        Boolean bool = cube1 instanceof Shape;
        System.out.println(cube1.getClass().getSimpleName() + " is an instance of " +
                cube1.getClass().getSuperclass().getSuperclass().getSimpleName() + ": " + bool);
        
        Cuboid cuboid1 = new Cuboid(4.5,5,10);
        outputMsg(cuboid1);
    }   
    
    private static void outputMsg(Shape shape){
        String shapeType = shape.getClass().getSimpleName();
        String aorvStr;
        double areaOrVolume;
        if (shape instanceof Shape2d){
            System.out.print(shapeType +" is 2d | ");
            aorvStr = "Area";
            areaOrVolume = ((Shape2d) shape).getArea2d();
        } else if (shape instanceof Shape3d){
            System.out.print(shapeType + " is 3d | ");
            aorvStr = "Volume";
            areaOrVolume = ((Shape3d) shape).getVolume();
        } else {
            throw new IllegalArgumentException("Shape is not valid, Shape must be instance of Shape2d or Shape3d");
        }
        System.out.println(aorvStr + " of " + shapeType + " = " + areaOrVolume);
    }

}
