import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        final int wiersze = scanner.nextInt();
        final int kolumny = scanner.nextInt();
        final int[][] array = new int[wiersze][kolumny];
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                array[i][j] = scanner.nextInt();
//                System.out.print(array[i][j]+" ");
            }
//            System.out.println();
        }

        int wynik = Integer.MIN_VALUE;
        int wspX = 0;
        int wspY = 0;
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                if (wynik < array[i][j]) {
                    wynik = array[i][j];
                    wspX = i;
                    wspY = j;
                }
            }
        }
        System.out.println(wspX + " " + wspY);


    }
}
