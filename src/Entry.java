/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Entry {
    
private String nama, telepon, alamat, kota;

    public Entry(String nama, String telepon, String alamat, String kota) {
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
        this.kota = kota;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public String getKota() { return kota; }
    public void setKota(String kota) { this.kota = kota; }

    @Override
    public String toString() {
        return nama + " - " + telepon + " - " + alamat + " - " + kota;
    }

    public String toCSV() {
        return nama + "," + telepon + "," + alamat + "," + kota;
    }

}
