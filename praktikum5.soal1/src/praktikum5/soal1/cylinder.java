package praktikum5.soal1;
import static java.lang.Math.pow;
public class cylinder extends shape {
    private double radius;
    private double height;
    
    public cylinder(double r, double h){
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }
    
    @Override
    public double area() {
        return 3.14*pow(radius, 2)*height;
    }
    
    @Override
    public String toString() 
    {
        return super.keString() + " of radius " + radius + " height " + height;
    }
}
