/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PembangunanGedung extends Pembangunan {
    private int jumlahLantai;

    public PembangunanGedung(String alamat, String tanggal, String lamaKontrak,
                             String namaProyek, String status, int jumlahLantai) {
        super(alamat, tanggal, lamaKontrak, namaProyek, status);
        this.jumlahLantai = jumlahLantai;
    }

    public int getJumlahLantai() { return jumlahLantai; }
    public void setJumlahLantai(int jumlahLantai) { this.jumlahLantai = jumlahLantai; }

    @Override
    public String getInfo() {
    return "Nama Proyek: " + getNamaProyek() +
           "\nAlamat: " + getAlamat() +
           "\nTanggal: " + getTanggal() +
           "\nLama Kontrak: " + getLamaKontrak() +
           "\nStatus: " + getStatus() +
           "\nJumlah Lantai: " + jumlahLantai;

    }
}