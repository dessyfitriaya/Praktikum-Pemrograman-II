package prak104_2110817220018_dessyfitriayaanwari;
import java.util.Scanner;
public class PRAK104_2110817220018_DESSYFITRIAYAANWARI {
    public static void main(String[] args) {
        System.out.print("Kartu Andi: ");
        
        Scanner masukan1 = new Scanner(System.in);
        String angka1 = masukan1.nextLine();
        String[] array_str1 = angka1.split(" ");
        int[] array_int1 = new int[array_str1.length];
        
        System.out.print("Kartu Budi: ");
        
        Scanner masukan2 = new Scanner(System.in);
        String angka2 = masukan2.nextLine();
        String[] array_str2 = angka2.split(" ");
        int[] array_int2 = new int[array_str2.length];
        
        int andi = 0, budi = 0;
        
        for(int a = 0; a < array_str1.length; a++){
            array_int1[a]= Integer.parseInt(array_str1[a]);
            array_int2[a] = Integer.parseInt(array_str2[a]);
            
            if(array_int1[a] > array_int2[a]) andi++;
            else budi++;
        }
        
        if(andi > budi) System.out.println("Andi");
        else System.out.println("Budi");
    }
}
