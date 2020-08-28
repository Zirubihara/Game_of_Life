import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String liczba = "";
        int number = 0;
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            liczba = scanner.nextLine();
            try {
                number = Integer.parseInt(liczba);
                if (number == 0) {
                    break;
                }
                System.out.println(number * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + liczba);
            }
        }
        // put your code here
    }
}
