import java.util.ArrayList;

public class Kantor {
    ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

    // Menambahkan pegawai
    void tambahPegawai(Pegawai pegawai) {
        daftarPegawai.add(pegawai);
        System.out.println(pegawai.nama + " telah ditambahkan.");
    }

    // Memecat pegawai
    void pecatPegawai(String nama) {
        for (int i = 0; i < daftarPegawai.size(); i++) {
            if (daftarPegawai.get(i).namaSama(nama) == 1) {
                System.out.println(daftarPegawai.get(i).nama + " telah dipecat.");
                daftarPegawai.remove(i);
                return;
            }
        }
        System.out.println("Pegawai dengan nama " + nama + " tidak ditemukan.");
    }

    // Menampilkan jumlah pegawai
    void cetakJumlahPegawai() {
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
    }

    // Menghitung total gaji
    void cetakTotalGaji() {
        int totalGaji = 0;
        for (Pegawai p : daftarPegawai) {
            totalGaji += p.hitungGaji();
        }
        System.out.println("Total Gaji: Rp " + totalGaji);
    }

    // Menghitung rata-rata gaji
    void cetakRataRataGaji() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("Rata-rata Gaji: Rp 0");
            return;
        }
        int totalGaji = 0;
        for (Pegawai p : daftarPegawai) {
            totalGaji += p.hitungGaji();
        }
        System.out.println("Rata-rata Gaji: Rp " + (totalGaji / daftarPegawai.size()));
    }
}
