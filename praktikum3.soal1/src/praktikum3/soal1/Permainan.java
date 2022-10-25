package praktikum3.soal1;
import java.util.Random;
import java.util.LinkedList;
public class Permainan {
    private int jumlah_dadu;
    int rand1;
    int total = 0;
    
    public void acakNilai() {
        Random rand = new Random();
        rand1 = rand.nextInt(1,6);
        
        LinkedList<Integer> hasil_acak = new LinkedList<Integer>();
        for(int x = 0; x < jumlah_dadu; x++) {
            hasil_acak.add(x, rand1);
        }
        
        for(int y = 0; y < jumlah_dadu; y++) {
            System.out.println("Dadu ke-" + (y+1) + " bernilai " + hasil_acak.get(y));
            total += hasil_acak.get(y);
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
    
    public void setJumlahDadu(int jumlah_dadu) {
        this.jumlah_dadu = jumlah_dadu;
    }
    
    public int getJumlahDadu() {
        return jumlah_dadu;
    }
}
