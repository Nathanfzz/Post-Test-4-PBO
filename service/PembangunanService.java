package service;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PembangunanService {
    private final ArrayList<Pembangunan> daftarPembangunan = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);


    public void tambah() {
        System.out.println("\n>>> TAMBAH CATATAN <<<");
        System.out.println("1. Pembangunan Jalan");
        System.out.println("2. Pembangunan Gedung");
        System.out.print("Pilih jenis: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        String alamat = inputValid("Masukkan alamat: ");
        String tanggal = inputValid("Masukkan tanggal proyek (dd-mm-yyyy): ");
        String lamaKontrak = inputValid("Masukkan lama kontrak: ");
        String namaProyek = inputValid("Masukkan nama proyek: ");
        String status = inputValid("Masukkan status (Pembangunan/Perbaikan/Selesai): ");

        if (pilihan == 1) {
            String jenisJalan = inputValid("Masukkan jenis jalan (Aspal/Beton/Tol): ");
            daftarPembangunan.add(new PembangunanJalan(alamat, tanggal, lamaKontrak, namaProyek, status, jenisJalan));
        } else if (pilihan == 2) {
            System.out.print("Masukkan jumlah lantai gedung: ");
            int jumlahLantai = scanner.nextInt();
            scanner.nextLine();
            daftarPembangunan.add(new PembangunanGedung(alamat, tanggal, lamaKontrak, namaProyek, status, jumlahLantai));
        } else {
            System.out.println("Pilihan tidak valid, data tidak ditambahkan.");
        }
    }


    public void lihat() {
        System.out.println("\n>>> DAFTAR PEMBANGUNAN <<<");
        if (daftarPembangunan.isEmpty()) {
            System.out.println("Belum ada catatan!");
            return;
        }
        for (int i = 0; i < daftarPembangunan.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println(daftarPembangunan.get(i).getInfo());
            System.out.println("--------------------");
        }
    }


    public void ubah() {
        lihat();
        if (daftarPembangunan.isEmpty()) return;

        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarPembangunan.size()) {
            System.out.println("Data tidak ditemukan!");
            return;
        }

        Pembangunan data = daftarPembangunan.get(index - 1);

        String alamatBaru = inputValid("Masukkan alamat baru: ");
        String tanggalBaru = inputValid("Masukkan tanggal proyek baru (dd-mm-yyyy): ");
        String lamaKontrakBaru = inputValid("Masukkan lama kontrak baru: ");
        String namaProyekBaru = inputValid("Masukkan nama proyek baru: ");
        String statusBaru = inputValid("Masukkan status baru (Pembangunan/Perbaikan/Selesai): ");

        data.setAlamat(alamatBaru);
        data.setTanggal(tanggalBaru);
        data.setLamaKontrak(lamaKontrakBaru);
        data.setNamaProyek(namaProyekBaru);
        data.setStatus(statusBaru);


        if (data instanceof PembangunanJalan jalan) {
            String jenisJalanBaru = inputValid("Masukkan jenis jalan baru (Aspal/Beton/Tol): ");
            jalan.setJenisJalan(jenisJalanBaru);
        } else if (data instanceof PembangunanGedung gedung) {
            System.out.print("Masukkan jumlah lantai baru: ");
            int jumlahLantaiBaru = scanner.nextInt();
            scanner.nextLine();
            gedung.setJumlahLantai(jumlahLantaiBaru);
        }

    System.out.println("Data berhasil diubah!");
}


    public void hapus() {
        lihat();
        if (daftarPembangunan.isEmpty()) return;

        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarPembangunan.size()) {
            System.out.println("Data tidak ditemukan!");
            return;
        }

        daftarPembangunan.remove(index - 1);
        System.out.println("Data berhasil dihapus!");
    }
    
    
    public void cari() {
    if (daftarPembangunan.isEmpty()) {
        System.out.println("Belum ada data untuk dicari!");
        return;
    }
    System.out.print("Masukkan kata kunci nama proyek: ");
    String keyword = scanner.nextLine().toLowerCase();
    cari(keyword); 
}

public void cari(String keyword) {
    boolean ditemukan = false;
    System.out.println("\n>>> HASIL PENCARIAN <<<");
    for (int i = 0; i < daftarPembangunan.size(); i++) {
        Pembangunan data = daftarPembangunan.get(i);
        if (data.getNamaProyek().toLowerCase().contains(keyword) ||
            data.getStatus().toLowerCase().contains(keyword)) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println(data.getInfo());
            System.out.println("--------------------");
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Data tidak ditemukan!");
    }
}



    private String inputValid(String pesan) {
        String input;
        do {
            System.out.print(pesan);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }
        } while (input.isEmpty());
        return input;
    }
}