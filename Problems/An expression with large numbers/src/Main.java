import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String value1 = scanner.next();
        String value2 = scanner.next();
        String value3 = scanner.next();
        String value4 = scanner.next();
        BigInteger a = new BigInteger(value1);
        BigInteger b = new BigInteger(value2);
        BigInteger c = new BigInteger(value3);
        BigInteger d = new BigInteger(value4);
        BigInteger result = a.negate().multiply(b).add(c).subtract(d);
        System.out.println(result);

    }
}
