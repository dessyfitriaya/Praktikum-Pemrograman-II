package negara;
import java.util.HashMap;
import java.util.Scanner;
public class Negara {
    Scanner masukan = new Scanner(System.in);
    
    int input, tanggal_merdeka, tahun_merdeka;
    String nama, jenis_pemimpin, nama_pemimpin,bulan_merdeka;
    
    public void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        int jumlah_negara = inputt.nextInt();

        Negara negara = new Negara();
        generator_ensiklopedia(negara);
        printDetail();
    }
    
    public void generator_ensiklopedia(Negara a) {
        for(int x = 0; x < getJumlahNegara(); x++) {
            a.nama = masukan.next();
            a.jenis_pemimpin = masukan.next();
            
            if("monarki".equals(jenis_pemimpin)) break;
            
            a.tanggal_merdeka = masukan.nextInt();
            a.bulan_merdeka = bulan.get(masukan.nextInt());
            a.tahun_merdeka = masukan.nextInt();
        }
    }
    
    static HashMap<Integer, String> bulan = new HashMap<Integer, String>(); {
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
    }

    public void setJumlahNegara(int jumlah_negara) {
        this.input = jumlah_negara;
    }
    
    public int getJumlahNegara() {
        return input;
    }
    
    public void printDetail(){
        System.out.print("Negara ");
        System.out.print(nama);
        System.out.print(" mempunyai ");
        if("monarki".equals(jenis_pemimpin)) System.out.print("Raja");
        else System.out.print(this.jenis_pemimpin);
        System.out.print(" bernama ");
        System.out.print(nama_pemimpin+"\n");
        if ("monarki".equals(jenis_pemimpin)) return;
        System.out.print("Deklarasi Kemerdekaan pada Tanggal ");
        System.out.print(tanggal_merdeka+" ");
        System.out.print(bulan_merdeka + " ");
        System.out.print(tahun_merdeka + "\n\n");
    }
}
