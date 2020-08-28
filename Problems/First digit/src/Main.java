import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int cyfra = liczba/10;
        System.out.println(cyfra);
    }
}
