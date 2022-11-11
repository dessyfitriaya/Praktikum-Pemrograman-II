package praktikum4.soal2;
public class Novel extends Buku {
    private String genre;
    private String sinopsis;
    
    public Novel(String judul, String penulis, Integer tahun, String genre, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    
    public String getNovelDetail() {
        return String.format("Sebuah novel bergenre %s dengan judul \"%s\". Novel tersebut ditulis oleh %s dan diterbitkan pada tahun %d.\nSinopsis : %s", this.genre, this.judul, this.penulis, this.tahun, this.sinopsis);
    }
}
