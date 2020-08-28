import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nap1 = scanner.nextLine();
        String nap2 = scanner.nextLine();
        nap1= nap1.replace(" ", "");
        nap2= nap2.replace(" ", "");
        System.out.println(nap1.equals(nap2));
    }
}
