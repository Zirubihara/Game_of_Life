import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        final int arrayLength = scanner.nextInt();
        final int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] + 1 == array[i] && array[i] + 1 == array[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
