import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String zero = "0";
        String num = scanner.nextLine();

        if (num.equals(zero)) {
            System.out.println(0);
        } else {
            BigInteger m = new BigInteger(num);
            BigInteger result = BigInteger.ONE;

            long i = 1;
            while (result.compareTo(m) < 0) {
                i++;
                result = result.multiply(BigInteger.valueOf(i));
            }

            System.out.println(i);
        }
    }
}
