import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int aktualna = a;
        int i;

        for (i = 1; aktualna<wysokosc; i++){
            aktualna-= b;
            aktualna+= a;

        }
        System.out.println(i);
    }
}
