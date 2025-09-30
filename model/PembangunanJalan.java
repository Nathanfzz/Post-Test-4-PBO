/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PembangunanJalan extends Pembangunan {
    private String jenisJalan;

    public PembangunanJalan(String alamat, String tanggal, String lamaKontrak,
                            String namaProyek, String status, String jenisJalan) {
        super(alamat, tanggal, lamaKontrak, namaProyek, status);
        this.jenisJalan = jenisJalan;
    }

    public String getJenisJalan() { return jenisJalan; }
    public void setJenisJalan(String jenisJalan) { this.jenisJalan = jenisJalan; }

    @Override
    public String getInfo() {
    return "Nama Proyek: " + getNamaProyek() +
           "\nAlamat: " + getAlamat() +
           "\nTanggal: " + getTanggal() +
           "\nLama Kontrak: " + getLamaKontrak() +
           "\nStatus: " + getStatus() +
           "\nJenis Jalan: " + jenisJalan;

    }
}