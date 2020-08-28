//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        int wiek = scanner.nextInt();
        String wyksztalcenie = scanner.next();
        int doswiadczenie = scanner.nextInt();
        String nwm = scanner.next();

        System.out.println("The form for "+imie+" is completed. We will contact" +
                " you if we need a chef that cooks "+nwm+" dishes.");
    }
}
