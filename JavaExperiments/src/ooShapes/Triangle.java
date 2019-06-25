package ooShapes;

public class Triangle extends Shape2d {
    private double sideBase;
    private double sideB;
    private double sideC;
    
    public Triangle(double h, double w){
        super(3,h,w);
    }
    
    // only to be used from CreateTriangleGiven3SideLengths(?,?,?) method
    private Triangle(double h, double w, double sbase, double sb, double sc){
        super(3,h,w);
        this.sideBase = sbase;
        this.sideB = sb;
        this.sideC = sc;
    }
    /**
     * Creates and returns Triangle object when length of three sides are given
     * Height and width are calculated using the 3 side parameters.
     * @param base first side of triangle
     * @param b    second side
     * @param c    third side
     * @return 
     */
    public static Triangle CreateTriangleGiven3SideLengths(double base, double b, double c){
        // base can also be used as width -- must be first argument
        double p = (base + b + c) / 2;
        double b4Square = p * (p - base) * (p - b) * (p - c);
        double area = Math.sqrt(b4Square);
        
        double halfBase = base / 2;         // calculate height and width before creating object
        double height = area / halfBase;
        Triangle tri = new Triangle(height,base,base,b,c);
        return tri;
    }
    

    @Override
    public double getArea2d() {
        // code for equilateral not used
      /*  double sroot3 = Math.sqrt(3);
        double s3divide4 = sroot3 / 4;
        double squaredSide = sideA * sideA;
       // return s3divide4 * squaredSide;*/
       return (height * width) / 2;
    } 
}