package praktikum4.soal1;
import java.util.Scanner;
public class main extends Buku {
    public static void main(String[] args) {
        Buku buku = new Buku();
        
        System.out.print("Judul: ");
        Scanner input1 = new Scanner(System.in);
        buku.setJudul(input1.nextLine());
       
        System.out.print("Penulis: ");
        Scanner input2 = new Scanner(System.in);
        buku.setPenulis(input2.nextLine());
        
        System.out.print("Tahun Terbit: ");
        Scanner input3 = new Scanner(System.in);
        buku.setTahun(input3.nextInt());
        
        buku.display();
    }
}
