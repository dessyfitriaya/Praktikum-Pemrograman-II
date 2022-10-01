package prak101_2110817220018_dessy.fitriaya.anwari;
import java.util.Scanner;
public class PRAK101_2110817220018_DESSYFITRIAYAANWARI {
    public static void main(String[] args) {
        
        String nama, tempat;
        int tanggal, bulan, tahun, tinggi;
        double berat;
        
        String[] bulan_huruf = {"Januari", "Februari", "Maret", "April", 
                                "Mei", "Juni", "Juli", "Agustus", "September", 
                                "Oktober", "November", "Desember"};
        
        System.out.print("Masukkan Nama Lengkap: ");
        Scanner input1 = new Scanner(System.in);
        nama = input1.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        Scanner input2 = new Scanner(System.in);
        tempat = input2.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        Scanner input3 = new Scanner(System.in);
        tanggal = input3.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        Scanner input4 = new Scanner(System.in);
        bulan = input4.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        Scanner input5 = new Scanner(System.in);
        tahun = input5.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        Scanner input6 = new Scanner(System.in);
        tinggi = input6.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        Scanner input7 = new Scanner(System.in);
        berat = input7.nextDouble();
        
        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap " + nama + ", Lahir di "
        + tempat + " pada Tanggal " + tanggal + " " + bulan_huruf[bulan - 1]
        + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan "
        + berat + " kilogram");  
    }    
}
