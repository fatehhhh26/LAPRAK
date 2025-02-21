import java.util.Scanner;

public class Scannerr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Masukan Nama :");
        String name = scanner.nextLine() ;
        System.out.println("Halo " + name);
        System.out.println("masukan umur anda : ");
        int umur = scanner.nextInt() ;
        System.out.println(" aloo saya adalah " + name + " umur saya adalah " + umur);
    }
}
