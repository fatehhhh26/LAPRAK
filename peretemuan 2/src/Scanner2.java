import java.util.Scanner;
import java.util.regex.Pattern;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("-") ;
        System.out.println("Masukan kata :");
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
    }
}
