import java.util.Scanner;

public class SoalLaprak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nama anda (Pembeli) : ");
        String NamaPembeli = scanner.nextLine();

        System.out.println("Total Harga : ");
        int TotalHarga = scanner.nextInt();

        System.out.println("     STRUK BELANJA     ");
        System.out.println("=======================");
        System.out.println("Nama Pembeli : " + NamaPembeli);
        System.out.println("Total Harga Belanja : " + TotalHarga);

        double diskon = 0;

        if (TotalHarga >= 300000) {
            diskon = 0.20;
            System.out.println("Anda dapat diskon 20%");
        } else if (TotalHarga >= 200000 && TotalHarga <= 299000) {
            diskon = 0.10 ;
            System.out.println("Anda dapat diskon 10%");
        } else if (TotalHarga >= 100000 && TotalHarga <= 199000) {
            diskon = 0.05;
            System.out.println("Anda dapat diskon 5%");
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }
        double totalSetelahDiskon = TotalHarga - (TotalHarga * diskon);
        System.out.println("Total harga yang harus dibayarkan: Rp " + totalSetelahDiskon);
    }
}