package praktikum4.soal2;
import java.util.Scanner;
public class Main extends Buku {
    public static void main(String[] args) {
        int jenis_buku;
        
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        Scanner input = new Scanner(System.in);
        jenis_buku = input.nextInt();
        
        if(jenis_buku == 1){
            System.out.print("Judul: ");
            Scanner input1 = new Scanner(System.in);
            String judul = input1.nextLine();
            
            System.out.print("Penulis: ");
            Scanner input2 = new Scanner(System.in);
            String penulis = input2.nextLine();
            
            System.out.print("Tahun Terbit: ");
            Scanner input3 = new Scanner(System.in);
            Integer tterbit = input3.nextInt();
            
            System.out.print("Genre: ");
            Scanner input4 = new Scanner(System.in);
            String genre = input4.nextLine();
            
            System.out.print("Sinopsis: ");
            Scanner input5 = new Scanner(System.in);
            String sinopsis = input5.nextLine();
            
            Novel novel = new Novel(judul, penulis, tterbit, genre, sinopsis);
            System.out.println("");
            System.out.println("Data yang baru diinputkan adalah");
            System.out.print(novel.getNovelDetail());
        }
        if(jenis_buku == 2){
            System.out.print("Judul: ");
            Scanner input1 = new Scanner(System.in);
            String judul = input1.next();
            
            System.out.print("Penulis: ");
            Scanner input2 = new Scanner(System.in);
            String penulis = input2.next();
            
            System.out.print("Tahun Terbit: ");
            Scanner input3 = new Scanner(System.in);
            Integer tterbit = input3.nextInt();
            
            System.out.print("Volume: ");
            Scanner input4 = new Scanner(System.in);
            Integer volume = input4.nextInt();
            
            System.out.print("Sinopsis: ");
            Scanner input5 = new Scanner(System.in);
            String sinopsis = input5.next();
            
            Komik komik = new Komik(judul, penulis, tterbit, volume, sinopsis);
            System.out.println("");
            System.out.println("Data yang baru diinputkan adalah");
            System.out.print(komik.getKomikDetail());
        }
    }
}
