import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Boolean case1 =  number>-15 && number<=12;
        Boolean case2 =  number>14 && number<17;
        Boolean case3 =  number>=19;
        if (case1 || case2 ||case3){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
