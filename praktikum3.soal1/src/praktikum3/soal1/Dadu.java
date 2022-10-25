package praktikum3.soal1;
import java.util.Scanner;
public class Dadu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int jumlah = masukan.nextInt();
        
        Permainan dadu = new Permainan();
        dadu.setJumlahDadu(jumlah);
        dadu.acakNilai();
    }
}
