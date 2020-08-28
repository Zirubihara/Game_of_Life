import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int liczba2;
        boolean inc = false;
        int liczba1;
        boolean dec = false;
        liczba1 = scanner.nextInt();
        while (scanner.hasNextInt()) {
            liczba2 = scanner.nextInt();
            if (liczba2 == 0) {
                break;
            }
            if (liczba2 > liczba1) {
                inc = true;
            } else if (liczba2 < liczba1) {
                dec = true;
            }
            liczba1 = liczba2;
        }
        if (inc && dec) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        long num = sc.nextLong();
//        long old;
//
//        boolean rordered = true;
//        boolean lordered = true;
//
//        while (true) {
//            old = num;
//            num = sc.nextLong();
//
//            if (num == 0) {
//                break;
//            }
//
//            if (rordered && num < old) {
//                rordered = false;
//                continue;
//            }
//
//            if (lordered && num > old) {
//                lordered = false;
//                continue;
//            }
//
//            if (!rordered && !lordered) {
//                break;
//            }
//        }
//
//        System.out.println(lordered || rordered);
//    }
//
//}
