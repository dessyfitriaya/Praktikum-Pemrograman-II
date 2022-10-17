package prak203.pkg2110817220018.dessy.fitriaya.anwari;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Baris kode berikut error karena tidak diakhiri semicolon (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Rovel";
        p1.setJabatan("Assasin");
        //Menambah baris kode ini agar umur tidak "0 tahun"
        p1.umur = 17;
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
