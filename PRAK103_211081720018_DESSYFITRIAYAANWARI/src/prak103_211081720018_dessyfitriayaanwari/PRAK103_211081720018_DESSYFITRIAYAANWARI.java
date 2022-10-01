package prak103_211081720018_dessyfitriayaanwari;
import java.util.Scanner;
public class PRAK103_211081720018_DESSYFITRIAYAANWARI {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int masukan = angka.nextInt(), a = 0;
        
        do {
           if((a == 0) && ((masukan % 7 != 0) || (masukan % 7 == 0))){
               System.out.print(masukan);
           }
           if((a > 0)&& ((masukan % 7 != 0) || (masukan % 7 == 0))){
               System.out.print(", " + masukan);
           }
           a++; masukan--;
        } while((masukan >= 0) && (a < 5));
    }
}
