package Mobil;

// class Mobil yang merepresentasikan atribut dan perilaku sebuah mobil
public class Mobil {
    private String nopol; // Variabel untuk menyimpan nomor polisi
    private String warna; // Variabel untuk menyimpan warna
    private String merk; // Variabel untuk menyimpan merek mobil
    private double jarakTempuh; // Variabel untuk menyimpan jarak tempuh
    private double waktu; // Variabel untuk menyimpan waktu tempuh dalam jam
    private int kecepatan; // Variabel untuk menyimpan kecepatan dalam km/h
    
    // Method untuk mengatur waktu tempuh dalam jam
    public void setWaktu(double w) {
        waktu = w; // Menyimpan nilai waktu dalam jam
        double waktuDalamDetik = rubahSekon(w); // Memanggil method rubahSekon dan konversi waktu ke detik
        System.out.println("Waktu dalam detik: " + waktuDalamDetik + " detik"); // Menampilkan waktu dalam detik
    }
    
    // Method private untuk mengubah waktu dari jam ke detik
    private double rubahSekon(double w) {
        return w * 3600; // Mengalikan jam dengan 3600 untuk mendapatkan detik
    }
    
    // Method untuk mengatur nomor polisi mobil
    public void setNopol (String n){
        nopol = n;
    }

    // Method untuk mengatur warna mobil
    public void setWarna (String s){
        warna = s;
    }

    // Method untuk mengatur merek mobil
    public void setMerk (String m){
        merk = m;
    }

    // Method untuk mengatur kecepatan mobil dalam km/h
    public void setKecepatan (int k){
        kecepatan = k;
        double kecepatanMps = rubahKecepatan(); // Memanggil method untuk konversi
        System.out.println("Kecepatan dalam meter per detik: " + kecepatanMps + " m/s");
    }
    
    // Method private untuk mengubah kecepatan dari km/h ke m/s
    private double rubahKecepatan() {
        return kecepatan * 1000.0 / 3600.0; // Rumus konversi dari km/h ke m/s
    }

    // Method untuk menghitung jarak yang dapat ditempuh mobil berdasarkan waktu
    public void hitungJarakTempuh(int w) {
        waktu = w;
        jarakTempuh = kecepatan * w; // Menggunakan rumus jarak = kecepatan * waktu
    }

     // Method untuk menghitung jarak berdasarkan rumus jarak = kecepatan * waktu
     public double hitungJarak() {
        return kecepatan * waktu; // Menghitung jarak tempuh berdasarkan kecepatan dan waktu
    }
    
    public void konversiKecepatan() {
        double kecepatanMps = kecepatan * 1000.0 / 3600.0;
        System.out.println("Kecepatan dalam meter per detik: " + kecepatanMps + " m/s");
    }
    

    public void displayMessage(){
        System.out.println("Mobil bermerk " + merk);
        System.out.println("Bernomor polisi " + nopol);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("Bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("Memiliki waktu tempuh " + waktu + " jam");
        System.out.println("Jarak tempuh mobil: " + jarakTempuh + " km");
    }
}
