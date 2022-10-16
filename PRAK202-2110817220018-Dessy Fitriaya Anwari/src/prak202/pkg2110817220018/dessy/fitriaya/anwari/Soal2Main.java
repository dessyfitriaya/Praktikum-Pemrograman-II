/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak202.pkg2110817220018.dessy.fitriaya.anwari;
public class Soal2Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merek = "Toyota Raize";
        mobil.tahun_keluaran = "2021";
        mobil.kapasitas = 988;
        mobil.harga = 202700000;
        
        mobil.info();
        mobil.setPemilik("Kasel");
        System.out.println("Pemilik Mobil: " + mobil.getPemilik());
        System.out.println("Pajak Mobil: Rp. " + mobil.getPajak());
    }
}
