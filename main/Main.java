/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;


import service.PembangunanService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PembangunanService service = new PembangunanService();
        int pilihan;

        do {
            System.out.println("\n>>> SISTEM PENCATATAN PEMBANGUNAN <<<");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Lihat Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Cari Catatan"); 
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input harus angka!");
                scanner.next();
                System.out.print("Pilih menu: ");
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
            case 1 -> service.tambah();
            case 2 -> service.lihat();
            case 3 -> service.ubah();
            case 4 -> service.hapus();
            case 5 -> service.cari();   
            case 6 -> System.out.println("Terima kasih! Program selesai.");
            default -> System.out.println("Pilihan tidak valid!");
}
        } while (pilihan != 6);

        scanner.close();
    }
}