package prak202.pkg2110817220018.dessy.fitriaya.anwari;
public class Mobil {
    public int kapasitas;
    public int harga;
    private int pajak;
    public String tahun_keluaran;
    public String merek;
    private String pemilik;
    
    public void info() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas);
    }
    
    public void setPemilik (String pemilik) {
        this.pemilik = pemilik;
    }
    public String getPemilik() {
        return pemilik;
    }
    
    public void setPajak(int pajak) {
        this.pajak = pajak;
    }
    public int getPajak(){
        return harga*2/100;
    }
}
