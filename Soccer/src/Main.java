public static void main(String[] args) {
    main.java.ScoreManager manager = new main.java.ScoreManager();

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