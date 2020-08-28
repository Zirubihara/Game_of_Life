import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        long wynik = 1L;

        for(;number1<number2;number1++){
            wynik *= number1;
        }
        System.out.println(wynik);
    }

}
