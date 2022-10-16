package prak201.pkg2110817220018.dessy_fitriaya_anwari;
public class Mangga {
    private String nama, warna, tekstur, rasa;
    private double berat;
    private int harga, jumlah;
    
    public Mangga(String nama, String warna, String tekstur, String rasa, double berat, int harga, int jumlah){
        this.nama = nama;
        this.warna = warna;
        this.tekstur = tekstur;
        this.rasa = rasa;
        this.berat = berat;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public void displayStatus() {
        System.out.println("Nama Mangga : " + getNama());
        System.out.println("Berat : " + getBerat() + " kg");
        System.out.println("Jumlah Beli : " + getJumlah());
        System.out.println("Total berat : " + getBerat()*getJumlah());
        System.out.println("Nama harga : Rp. " + getHarga()*getJumlah());
        System.out.println();
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    
    public void setTekstur(String tekstur) {
        this.tekstur = tekstur;
    }
    public String getTekstur(){
        return tekstur;
    }
    
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }
    
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public double getBerat(){
        return berat;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return jumlah;
    }
}
