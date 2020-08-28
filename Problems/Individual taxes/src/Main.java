import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int limit = scanner.nextInt();
        final int[] incomes = new int[limit];
        final int[] taxes = new int[limit];
        int comparator = 0;
        int result = 0;

        for (int i = 0; i < limit * 2; i++) {
            if (i < limit) {
                incomes[i] = scanner.nextInt();
                continue;
            }
            taxes[i - limit] = scanner.nextInt();
        }

        for (int i = 0; i < limit; i++) {
            if (incomes[i] * taxes[i] > comparator) {
                comparator = incomes[i] * taxes[i];
                result = i + 1;
            }
        }

        System.out.println(result);
    }
}
