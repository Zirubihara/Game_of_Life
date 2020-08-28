import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);
        int wynik = 0;
        for (int i = 0; i < n; i++) {
            wynik += random.nextInt(b - a + 1) + a;
        }
        System.out.println(wynik);
    }
}
