package Model;

import java.util.Date;
 
public class PembelianTiket {

    String st_asal;
    String st_tujuan;
    String tiba;
    String berangkat;
    String id_kereta;
    String Nama_kereta;
    String Tujuan;
    String Kelas;
    int harga;

    public String getId_kereta() {
        return id_kereta;
    }

    public void setId_kereta(String id_kereta) {
        this.id_kereta = id_kereta;
    }

    public String getNama_kereta() {
        return Nama_kereta;
    }

    public void setNama_kereta(String Nama_kereta) {
        this.Nama_kereta = Nama_kereta;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    public String getSt_asal() {
        return st_asal;
    }

    public void setSt_asal(String st_asal) {
        this.st_asal = st_asal;
    }

    public String getSt_tujuan() {
        return st_tujuan;
    }

    public void setSt_tujuan(String st_tujuan) {
        this.st_tujuan = st_tujuan;
    }

    public String getBerangkat() {
        return berangkat;
    }

    public void setBerangkat(String berangkat) {
        this.berangkat = berangkat;
    }

    public String getTiba() {
        return tiba;
    }

    public void setTiba(String tiba) {
        this.tiba = tiba;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
