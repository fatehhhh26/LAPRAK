public class Main {
    public static void main(String[] args) {
        Kantor kantor = new Kantor();

        // Menambahkan pegawai
        Pegawai p1 = new Pegawai("Budi", "manager", 5);
        Pegawai p2 = new Pegawai("Ani", "staff", 3);
        Pegawai p3 = new Pegawai("fatih","servis",10);
        Pegawai p4 = new Pegawai("justin","manager",15);

        kantor.tambahPegawai(p1);
        kantor.tambahPegawai(p2);
        kantor.tambahPegawai(p3);
        kantor.tambahPegawai(p4);

        System.out.println(" ");

        // Menampilkan jumlah pegawai, total gaji, dan rata-rata gaji
        System.out.println("=====INFORMASI JUMLAH PEGAWAI");
        kantor.cetakJumlahPegawai();
        System.out.println(" ");

        System.out.println("=====INFORMASI TOTAL GAJI PEGAWAI=====");
        kantor.cetakTotalGaji();
        System.out.println(" ");

        System.out.println("=====INFROMASI RATA RATA GAJI=====");
        kantor.cetakRataRataGaji();
        System.out.println(" ");

        System.out.println("=====INFROMASI PEGAWAI=====");
        // Menampilkan informasi gaji pegawai
        System.out.println("Informasi Pegawai 1:");
        p1.ambilSlipGaji();
        System.out.println(" ");

        System.out.println("Informasi Pegawai 2:");
        p2.ambilSlipGaji();
        System.out.println(" ");

        System.out.println("informasi Pegawai 3 : ");
        p3.ambilSlipGaji();
        System.out.println(" ");

        System.out.println("informasi Pegawai 4 : ");
        p4.ambilSlipGaji();
        System.out.println(" ");

        // Memecat pegawai
        System.out.println("=====INFROMASI PEMECATAN");
        kantor.pecatPegawai("Ani");
        kantor.pecatPegawai("fatih");
        kantor.pecatPegawai("Budi");
        System.out.println(" ");

        // Menampilkan jumlah pegawai setelah pemecatan
        System.out.println("=====INFORMASI JUMLAH PEGAWAI SEKARANG=====");
        kantor.cetakJumlahPegawai();
    }
}
