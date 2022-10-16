/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201.pkg2110817220018.dessy_fitriaya_anwari;
public class PRAK2012110817220018DESSY_FITRIAYA_ANWARI {
    public static void main(String[] args) {
        Mangga Arumanis = new Mangga("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 0.3, 5000, 13);
        Mangga Manalagi = new Mangga("Manalagi", "hijau", "kasar", "manis", 0.5, 7500, 17);
        Mangga Madu = new Mangga("Madu", "kuning", "lembut", "manis", 0.375, 6500, 12);
        
        Arumanis.displayStatus();
        Manalagi.displayStatus();
        Madu.displayStatus();
    }
}
