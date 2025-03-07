package main.java;

import java.util.ArrayList;

// Kelas ScoreManager untuk mengelola nilai anak
public class ScoreManager {
    private ArrayList<Integer> scores;

    // Constructor untuk inisialisasi ArrayList
    public ScoreManager() {
        this.scores = new ArrayList<>();
    }

    // Method untuk menambahkan nilai
    public void tambahNilai(int nilai) {
        scores.add(nilai);
    }

    // Method untuk menghitung total nilai
    public int totalNilai() {
        int total = 0;
        for (int nilai : scores) {
            total += nilai;
        }
        return total;
    }

    // Method untuk menghitung rata-rata nilai
    public double rataRata() {
        if (scores.isEmpty()) return 0;
        return (double) totalNilai() / scores.size();
    }

    // Method untuk mencari nilai tertinggi
    public int nilaiTertinggi() {
        int max = Integer.MIN_VALUE;
        for (int nilai : scores) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    // Method untuk mencari nilai terendah
    public int nilaiTerendah() {
        int min = Integer.MAX_VALUE;
        for (int nilai : scores) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }

    // Method untuk menghitung perbedaan nilai tertinggi dan terendah
    public int selisihNilai() {
        return nilaiTertinggi() - nilaiTerendah();
    }

    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();

        // Menambahkan nilai anak
        manager.tambahNilai(85);
        manager.tambahNilai(90);
        manager.tambahNilai(78);
        manager.tambahNilai(92);

        // Menampilkan hasil
        System.out.println("Total Nilai: " + manager.totalNilai());
        System.out.println("Rata-rata Nilai: " + manager.rataRata());
        System.out.println("Nilai Tertinggi: " + manager.nilaiTertinggi());
        System.out.println("Nilai Terendah: " + manager.nilaiTerendah());
        System.out.println("Selisih Tertinggi dan Terendah: " + manager.selisihNilai());
    }
}
