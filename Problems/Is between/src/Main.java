import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int wartosc1 = scanner.nextInt();
        int wartosc2 = scanner.nextInt();
        int wartosc3 = scanner.nextInt();

        boolean wartosc = wartosc1>=wartosc2 && wartosc1<= wartosc3;
        boolean wartosci = wartosc1 >= wartosc3 && wartosc1 <= wartosc2;

        System.out.println(wartosc || wartosci);
    }
}
