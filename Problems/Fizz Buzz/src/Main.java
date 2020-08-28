import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();


        for (; liczba1 <= liczba2; liczba1++) {
            if (liczba1 % 5 == 0) {
                if (liczba1 % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
            }
            else if (liczba1 % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(liczba1);
            }
        }

    }
}
