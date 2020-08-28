import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                twoDimArray[i][j] = Math.abs(j - i);
            }
        }
        for (int[] row : twoDimArray) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
