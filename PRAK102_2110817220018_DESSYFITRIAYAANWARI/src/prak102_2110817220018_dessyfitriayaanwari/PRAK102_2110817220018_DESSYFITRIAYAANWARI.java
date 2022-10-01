package prak102_2110817220018_dessyfitriayaanwari;
import java.util.Scanner;
import java.util.Arrays;
public class PRAK102_2110817220018_DESSYFITRIAYAANWARI {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int masukan = angka.nextInt(), a = 0;
            
        while((masukan >= 0) && (a < 7)){
            if(a == 0){
                if(masukan % 2 != 0) System.out.print(masukan);
                else {
                    System.out.print((masukan/2)-1);
                }
            }
            if(a != 0){
                if(masukan % 2 != 0) {
                    System.out.print(", " + masukan);
                }
                if(masukan % 2 == 0){
                    System.out.print(", " + ((masukan/2)-1));
                }
            }
            masukan++; 
            a++;
        }
    }
}
