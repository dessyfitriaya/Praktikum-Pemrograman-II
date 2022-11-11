package praktikum4.soal1;
public class Buku {
    private String judul;
    private String penulis;
    private Integer tahun;
    
    public void Buku(String judul, String penulis, Integer tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    
    public void display() {
        System.out.println();
        System.out.println("Detail buku: \nJudul adalah " + judul + "\nPenulis adalah " + penulis + "\nTahun Terbit adalah " + tahun);
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }
}
