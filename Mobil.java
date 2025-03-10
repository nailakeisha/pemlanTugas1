package Mobil;

// class Mobil yang merepresentasikan atribut dan perilaku sebuah mobil
public class Mobil {
    private String nopol; // Variabel untuk menyimpan nomor polisi
    private String warna; // Variabel untuk menyimpan warna
    private String merk; // Variabel untuk menyimpan merek mobil
    private double jarakTempuh; // Variabel untuk menyimpan jarak tempuh
    private double waktu; // Variabel untuk menyimpan waktu tempuh dalam jam
    private int kecepatan; // Variabel untuk menyimpan kecepatan dalam km/h
    
    // Method untuk mengatur nomor polisi mobil
    public void setNopol(String n) { nopol = n; } // Menyimpan nomor polisi yang diinput pengguna

    // Method untuk mengatur warna mobil
    public void setWarna(String s) { warna = s; } // Menyimpan warna mobil yang diinput pengguna

    // Method untuk mengatur merek mobil
    public void setMerk(String m) { merk = m; } // Menyimpan merek mobil yang diinput pengguna

    // Method untuk mengatur kecepatan mobil dalam km/h
    public void setKecepatan(int k) {
        kecepatan = k; // Menyimpan nilai kecepatan yang diinput pengguna
        System.out.println("Kecepatan dalam meter per detik: " + rubahKecepatan() + " m/s"); // Menampilkan hasil konversi kecepatan
    }

    // Method private untuk mengubah kecepatan dari km/h ke m/s
    private double rubahKecepatan() {
        return kecepatan / 3.6; // Mengonversi km/h ke m/s
    }

    // Method untuk mengatur waktu tempuh dalam jam
    public void setWaktu(double w) {
        waktu = w; // Menyimpan nilai waktu tempuh
        System.out.println("Waktu dalam detik: " + rubahSekon(w) + " detik"); // Menampilkan hasil konversi waktu ke detik
    }

    // Method private untuk mengubah waktu dari jam ke detik
    private double rubahSekon(double w) {
        return w * 3600; // Mengonversi waktu dari jam ke detik
    }

    // Method untuk menghitung jarak tempuh dalam km
    public void hitungJarakTempuh() {
        jarakTempuh = kecepatan * waktu; // Menghitung jarak dengan rumus: jarak = kecepatan * waktu
    }

    // Method untuk mengonversi jarak dari km ke meter
    private double rubahMeter() {
        return jarakTempuh * 1000; // Mengonversi jarak dari km ke meter
    }

    // Method untuk menampilkan informasi mobil
    public void displayMessage() {
        System.out.println("\n--- Informasi Mobil ---"); // Header tampilan informasi mobil
        System.out.println("Mobil bermerk: " + merk); // Menampilkan merek mobil
        System.out.println("Nomor polisi: " + nopol); // Menampilkan nomor polisi
        System.out.println("Warna mobil: " + warna); // Menampilkan warna mobil
        System.out.println("Kecepatan: " + kecepatan + " km/jam"); // Menampilkan kecepatan dalam km/h
        System.out.println("Kecepatan dalam meter per detik: " + rubahKecepatan() + " m/s"); // Menampilkan kecepatan dalam m/s
        System.out.println("Waktu tempuh: " + waktu + " jam"); // Menampilkan waktu tempuh dalam jam
        System.out.println("Waktu dalam detik: " + rubahSekon(waktu) + " detik"); // Menampilkan waktu tempuh dalam detik
        System.out.println("Jarak tempuh: " + jarakTempuh + " km"); // Menampilkan jarak tempuh dalam km
        System.out.println("Jarak tempuh dalam meter: " + rubahMeter() + " meter"); // Menampilkan jarak tempuh dalam meter
    }
}
