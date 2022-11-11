package praktikum4.soal2;
public class Komik extends Buku {
    private Integer volume;
    private String sinopsis;
    
    public Komik(String judul, String penulis, Integer tahun, Integer volume, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.volume = volume;
        this.sinopsis = sinopsis;
    }
    
    public String getKomikDetail() {
        return String.format("Sebuah komik dengan judul \"%s\". Komik tersebut dibuat oleh %s dan diterbitkan pada tahun %d. Sampai saat ini komik tersebut memiliki jumlah volume sebanyak %d buah. \nSinopsis : %s", this.judul, this.penulis, this.tahun, this.volume, this.sinopsis);
    }
}
