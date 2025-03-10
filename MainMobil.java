package Mobil;

import java.util.Scanner;

// class MainMobil digunakan untuk mengelola objek Mobil dan menjalankan program utama
public class MainMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Membuat objek Scanner untuk input pengguna

        // Membuat objek mobil pertama menggunakan class Mobil
        Mobil m1 = new Mobil();
        
        // Meminta input dari pengguna untuk atribut mobil pertama
        System.out.print("Masukkan merk mobil pertama: ");
        m1.setMerk(sc.nextLine());// Mengatur merek mobil pertama berdasarkan input pengguna
        
        System.out.print("Masukkan nomor polisi mobil pertama: ");
        m1.setNopol(sc.nextLine());// Mengatur nomor polisi mobil pertama berdasarkan input pengguna
        
        System.out.print("Masukkan warna mobil pertama: ");
        m1.setWarna(sc.nextLine());// Mengatur warna mobil pertama berdasarkan input pengguna
        
        System.out.print("Masukkan kecepatan mobil pertama (km/h): ");
        m1.setKecepatan(sc.nextInt());// Mengatur kecepatan mobil pertama dalam km/h berdasarkan input
        
        System.out.print("Masukkan waktu tempuh mobil pertama (jam): ");
        m1.setWaktu(sc.nextDouble()); // Mengatur waktu tempuh dalam jam berdasarkan input
        
        m1.konversiKecepatan();// Memanggil method untuk mengonversi kecepatan dari km/h
        m1.displayMessage();// Menampilkan informasi lengkap tentang mobil pertama

        System.out.println("===============================");

        // Membersihkan buffer scanner
        sc.nextLine();

        // Membuat objek mobil kedua
        Mobil m2 = new Mobil();

        // Meminta input dari pengguna untuk atribut mobil kedua
        System.out.print("Masukkan merk mobil kedua: ");
        m2.setMerk(sc.nextLine());// Mengatur merek mobil kedua berdasarkan input pengguna
        
        System.out.print("Masukkan nomor polisi mobil kedua: ");
        m2.setNopol(sc.nextLine()); // Mengatur nomor polisi mobil kedua berdasarkan input pengguna
        
        System.out.print("Masukkan warna mobil kedua: ");
        m2.setWarna(sc.nextLine());// Mengatur warna mobil kedua berdasarkan input pengguna
        
        System.out.print("Masukkan kecepatan mobil kedua (km/h): ");
        m2.setKecepatan(sc.nextInt());// Mengatur kecepatan mobil kedua dalam km/h berdasarkan input
        
        System.out.print("Masukkan waktu tempuh mobil kedua (jam): ");
        m2.setWaktu(sc.nextDouble());// Mengatur waktu tempuh dalam jam berdasarkan input
        
        m2.konversiKecepatan();// Memanggil method untuk mengonversi kecepatan dari km/h ke m/s
        m2.displayMessage();// Menampilkan informasi lengkap tentang mobil kedua

        System.out.println("===============================");
        System.out.println("Atribut warna pada objek m1 diubah.");

        // Mengubah warna mobil pertama
        sc.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan warna baru untuk mobil pertama: ");// Mengubah warna mobil pertama berdasarkan input pengguna
        m1.setWarna(sc.nextLine());// Mengubah warna mobil pertama sesuai input baru dari pengguna

        // Menampilkan ulang informasi mobil pertama setelah perubahan warna
        m1.displayMessage();// Memanggil method untuk menampilkan informasi terbaru dari mobil pertama

    }
}