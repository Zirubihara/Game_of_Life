import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        final int busHeight = scanner.nextInt();
        final int numbersOfBridges = scanner.nextInt();
        boolean busFine = true;
        int i = 1;
        while (i < numbersOfBridges) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                busFine = false;
                break;
            }
            i++;
        }
        if (busFine) {
            System.out.println("Will not crash");
        }

    }
}
