import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final long m = new Scanner(System.in).nextLong();
        int pom =1;
        long fact =1L;
        while (fact<=m) {
            pom++;
            fact *= pom;


        }
        System.out.println(pom);
    }
}
