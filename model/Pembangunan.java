/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Pembangunan implements Laporan {
    private String alamat;
    private String tanggal;
    private String lamaKontrak;
    private String namaProyek;
    private String status;

    public Pembangunan(String alamat, String tanggal, String lamaKontrak,
                       String namaProyek, String status) {
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.lamaKontrak = lamaKontrak;
        this.namaProyek = namaProyek;
        this.status = status;
    }

    
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getLamaKontrak() { return lamaKontrak; }
    public void setLamaKontrak(String lamaKontrak) { this.lamaKontrak = lamaKontrak; }

    public String getNamaProyek() { return namaProyek; }
    public void setNamaProyek(String namaProyek) { this.namaProyek = namaProyek; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

   
    public abstract String getInfo();
    
    @Override
    public void cetakLaporan() {

    }
}
   
