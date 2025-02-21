import java.util.Scanner;

public class SoalLaprak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Masukan nama anda disini : ");
        String nama = scanner.nextLine();

        System.out.println("Masukan Umur anda disini : ");
        int umur = scanner.nextInt();

        System.out.println("Masukan NIK anda disini : ");
        long nik = scanner.nextLong();

        System.out.println("Masukan IPK anda disini : ");
        float ipk = scanner.nextFloat();

        if (ipk >= 3.5) {
            System.out.println("Anda memenuhi syarat beasiswa");
        } else {
            System.out.println("Anda tidak memenuhi syarat beasiswa");
        }


    }
}
