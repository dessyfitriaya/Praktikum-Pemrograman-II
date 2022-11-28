package praktikum5.soal1;
import java.text.DecimalFormat;
public class PaintThings {
//-----------------------------------------
// Creates some shapes and a Paint object
// and prints the amount of paint needed
// to paint each shape.
//-----------------------------------------
    public static void main (String[] args) {
        final double COVERAGE = 350;
        
        paint paint = new paint(COVERAGE);
        rectangle deck = new rectangle(20, 30);
        sphere bigBall = new sphere(15);
        cylinder tank = new cylinder(10, 30);
        
        double deckAmt = paint.amount(deck); 
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        // Instantiate the three shapes to paint
        // Compute the amount of paint needed for each shape
        // Print the amount of paint for each.
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}
