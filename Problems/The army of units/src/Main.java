import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int jednostki = scanner.nextInt();
        if (jednostki<1){
            System.out.println("no army");
        } else if (jednostki>=1 && jednostki<=19){
            System.out.println("pack");
        } else if (jednostki>=20 && jednostki<=249){
            System.out.println("throng");
        }
        else if (jednostki>=250 && jednostki<=999){
            System.out.println("zounds");
        }
        else if (jednostki>=1000){
            System.out.println("legion");
        }
    }
}
