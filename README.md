Dinathan Fahrezi 2409116050
Struktur Program


<img width="334" height="244" alt="image" src="https://github.com/user-attachments/assets/f3fe7ed0-d1ad-487e-a543-c67fbf2f0b44" />




1. Package main
   berisi class Main.java yang menjadi entry point program untuk menampilkan menu, menerima input pengguna, dan memanggil method pada PembangunanService guna menjalankan operasi CRUD serta pencarian data. 

2. package model
   Berisi class Pembangunan.java yang merepresentasikan struktur data dari sebuah catatan pembangunan atau perbaikan kota. pembangunan.java sebagai superclass dengan pembangunanJalan.java dan pembangunanGedung.java sebagai subclass

3. package service
   Package service berisi class PembangunanService.java yang menangani seluruh logika bisnis program, seperti menambah data dengan membuat objek Pembangunan baru dan menyimpannya dalam daftar, menampilkan semua catatan yang tersimpan, memperbarui data proyek tertentu sesuai pilihan pengguna, menghapus catatan dari daftar, mencari catatan berdasarkan kata kunci nama proyek.
   
**Deskripsi Program**


Program ini merupakan sebuah sistem CRUD (Create, Read, Update, Delete) yang berfungsi untuk mencatat berbagai informasi tentang pembangunan

**Alur Program**
 

*Menu Awal
  
   
   <img width="426" height="175" alt="image" src="https://github.com/user-attachments/assets/2f385232-e92e-4e83-82d5-443fbdfe04d6" />


Tampilan awal ketika pertama kali menjalankan program

1. Tambahkan Catatan


    <img width="649" height="493" alt="image" src="https://github.com/user-attachments/assets/e7d30870-28b1-4284-8555-cf15f566bf23" />



   Pilihan ini berfungsi untuk menambahkan catatan informasi
   
2. Lihat Catatan


    <img width="422" height="444" alt="image" src="https://github.com/user-attachments/assets/a60e3819-1110-49bd-ad6a-5bbad6cc260e" />




   pilihan ini berfungsi untuk melihat catatan informasi yang sudah kita tambahkan tadi
   
3. Ubah Catatan


    <img width="684" height="663" alt="image" src="https://github.com/user-attachments/assets/76cdab81-c283-40fa-a103-3e6b7207c6c6" />



   pilihan ini berfungsi untuk meng update informasi yang telah tercatat
   
4. Hapus Catatan


<img width="336" height="604" alt="image" src="https://github.com/user-attachments/assets/165b55cb-4040-469e-b6f9-7a4a427db075" />


   

5. Cari catatan


   <<img width="458" height="459" alt="image" src="https://github.com/user-attachments/assets/cdad4b2a-80a8-49a7-90a8-291b61ecb357" />


6. Keluar


   <img width="419" height="228" alt="image" src="https://github.com/user-attachments/assets/211b014d-bedc-4099-9fd4-81d5a0873524" />




**Penjelasan kode**


import java.util.ArrayList;
import java.util.Scanner;

Program menggunakan ArrayList untuk menyimpan data proyek dan Scanner untuk membaca input dari pengguna.
Class Pembangunan
Class ini merepresentasikan data proyek pembangunan/perbaikan.
Atribut yang disimpan adalah jenis, alamat, tanggal, lamaKontrak, namaProyek, dan status.
Constructor digunakan untuk mengisi data, sedangkan toString() digunakan untuk menampilkan data dalam format rapi.
Dalam program ini, getter dipakai untuk mengambil data proyek seperti getNamaProyek(), sedangkan setter dipakai untuk mengubah data proyek seperti setNamaProyek() agar atribut tetap terlindungi (encapsulation).
Inheritance pada program ini class PembangunanJalan dan PembangunanGedung mewarisi atribut dan method dari superclass Pembangunan.
Override pada program ini yaitu class PembangunanJalan dan PembangunanGedung menimpa method getInfo() dari superclass Pembangunan untuk menambahkan informasi khusus sesuai jenis pembangunan.

Deklarasi Variabel Utama

daftarPembangunan → menyimpan semua data proyek dalam ArrayList.

scanner → membaca input dari pengguna.

pilihan → menyimpan angka menu yang dipilih pengguna.

Menu Utama dengan Perulangan
Program menampilkan menu utama menggunakan perulangan do...while.
Program akan terus berjalan sampai pengguna memilih opsi 5 (Keluar).

Menu 1 – Tambah Catatan
Pengguna diminta mengisi data proyek baru (jenis, alamat, tanggal, lama kontrak, nama proyek, status).
Data kemudian dimasukkan ke dalam ArrayList sebagai objek Pembangunan.

Menu 2 – Lihat Catatan
Jika data kosong, program menampilkan pesan bahwa belum ada catatan.
Jika ada data, program menampilkan semua catatan dengan format rapi menggunakan toString().

Menu 3 – Ubah Catatan
Program menampilkan daftar proyek dengan nomor urut.
Pengguna memilih data yang ingin diubah berdasarkan nomor.
Jika nomor valid, pengguna dapat mengganti data lama dengan data baru.

Menu 4 – Hapus Catatan
Program menampilkan daftar proyek dengan nomor urut.
Pengguna memilih data yang ingin dihapus.
Data dihapus dari ArrayList menggunakan remove().

Menu 5 - Cari Catatan
berfungsi untuk mencari data proyek yang sudah disimpan berdasarkan kata kunci pada nama proyek.

Menu 6 – Keluar
Program berhenti berjalan dan menampilkan pesan terima kasih.

