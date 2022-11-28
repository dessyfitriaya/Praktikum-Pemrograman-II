package praktikum5.soal1;
public class paint {
    private double coverage;
    
    public paint (double c) {
        this.coverage = c;
    }
    
    public double amount (shape s) {
        System.out.println("Computing amount for " + s.toString());
        return s.area()/coverage;
    }
}
