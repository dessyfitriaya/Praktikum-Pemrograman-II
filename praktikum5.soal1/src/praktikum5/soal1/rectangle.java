package praktikum5.soal1;
public class rectangle extends shape {
    private double length;
    private double width;
    
    public rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }
    
    @Override
    public double area() {
        return length*width;
    }
    
    @Override
    public String toString() {
        return super.keString() + " of length " + length + " and width " + width;
    };
}
