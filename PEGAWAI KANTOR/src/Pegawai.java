public class Pegawai {
    String nama;
    String posisi;
    int lamaKerja;

    // Konstruktor
    public Pegawai(String Nama, String Posisi, int LamaKerja) {
        nama = Nama;
        posisi = Posisi;
        lamaKerja = LamaKerja;
    }

    // Menampilkan gaji berdasarkan posisi
    void cetakGaji() {
        int gaji = hitungGaji();
        System.out.println("Gaji: Rp " + gaji);
    }

    // Menghitung gaji sesuai posisi
    int hitungGaji() {
        if (posisi.equals("manager")) {
            return 15000000;
        } else if (posisi.equals("staff")) {
            return 8000000;
        } else if (posisi.equals("servis")) {
            return 3000000;
        }
        return 0;
    }

    // Cetak slip gaji
    void ambilSlipGaji() {
        System.out.println("Slip Gaji: " + nama + " - Posisi: " + posisi);
        cetakGaji();
    }

    // Cek apakah nama sama (menggunakan if biasa)
    int namaSama(String n) {
        if (nama.equals(n)) {
            return 1; // Nama cocok
        }
        return 0; // Nama tidak cocok
    }
}
