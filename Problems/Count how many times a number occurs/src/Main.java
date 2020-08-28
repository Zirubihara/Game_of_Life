import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int limit = scanner.nextInt();
        final int[] numbers = new int[limit];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        final int input = scanner.nextInt();
        int result = 0;

        for (int number : numbers) {
            if (number == input) {
                result++;
            }
        }
        System.out.println(result);
    }
}
