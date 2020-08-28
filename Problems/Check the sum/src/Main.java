import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean op1 = a+b == 20;
        boolean op2 = a+c == 20;
        boolean op3 = c+b == 20;

        System.out.println(op1|| op2 || op3);
    }
}
