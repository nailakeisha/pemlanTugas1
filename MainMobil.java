package Mobil;

import java.util.Scanner;

// class MainMobil digunakan untuk mengelola objek Mobil dan menjalankan program utama
public class MainMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        // Membuat objek mobil
        Mobil m1 = new Mobil();

        // Meminta input dari pengguna
        System.out.print("Masukkan merk mobil: ");
        m1.setMerk(sc.nextLine()); // Menyimpan merek mobil yang dimasukkan pengguna

        System.out.print("Masukkan nomor polisi mobil: ");
        m1.setNopol(sc.nextLine()); // Menyimpan nomor polisi mobil yang dimasukkan pengguna

        System.out.print("Masukkan warna mobil: ");
        m1.setWarna(sc.nextLine()); // Menyimpan warna mobil yang dimasukkan pengguna

        System.out.print("Masukkan kecepatan mobil (km/h): ");
        int kecepatan = sc.nextInt(); // Menerima input kecepatan dalam km/h dari pengguna
        m1.setKecepatan(kecepatan); // Kecepatan akan dikonversi ke m/s di dalam setKecepatan()

        System.out.print("Masukkan waktu tempuh mobil (jam): ");
        double waktu = sc.nextDouble(); // Menerima input waktu tempuh dalam jam
        m1.setWaktu(waktu); // Waktu akan dikonversi ke detik di dalam setWaktu()

        // Menghitung jarak tempuh berdasarkan input kecepatan & waktu
        m1.hitungJarakTempuh(); // Menggunakan rumus jarak = kecepatan * waktu

        // Menampilkan informasi lengkap
        System.out.println("\n===== INFORMASI MOBIL =====");
        m1.displayMessage(); // Memanggil method untuk menampilkan seluruh informasi mobil
    }
}
