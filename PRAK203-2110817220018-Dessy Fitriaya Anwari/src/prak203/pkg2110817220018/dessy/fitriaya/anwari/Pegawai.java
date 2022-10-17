package prak203.pkg2110817220018.dessy.fitriaya.anwari;
public class Pegawai {
    public String nama;
    /*Pada baris ini, variabel "asal" lebih baik bertipe data String
    karena nama tempat asal terdiri lebih dari satu huruf */
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }
    
    /*Parameter pada baris kode ini harus diisi sebuah variabel agar 
    bisa me-assign value ke dalam variabel tersebut */
    //public void setJabatan() {
    public void setJabatan(String jabatan) {
        /*variabel "jabatan" di sini merujuk pada variabel "jabatan"
        yang telah dideklarasikan sebelumnya*/
        //this.jabatan = j;
        this.jabatan = jabatan;
    }
}
