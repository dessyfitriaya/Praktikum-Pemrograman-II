package prak105_2110817220018_dessyfitriayaanwari;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PRAK105_2110817220018_DESSYFITRIAYAANWARI {
    public static void main(String[] args) {
        final double phi = 3.14; 
        DecimalFormat rounded_volume = new DecimalFormat();
        rounded_volume.setMaximumFractionDigits(3);
        
        System.out.print("Masukkan jari-jari: ");
        Scanner input1 = new Scanner(System.in);
        double jari_jari = input1.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        Scanner input2 = new Scanner(System.in);
        double tinggi = input2.nextDouble();
        
        double volume = Math.pow(jari_jari, 2) * phi * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " +
        jari_jari + " cm dan tinggi " + tinggi + " cm adalah " +
                rounded_volume.format(volume) + " m3");
        
        
    }
    
}
