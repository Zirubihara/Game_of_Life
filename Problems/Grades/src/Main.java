import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        for (int i =0; i<n;i++){
            int pom = scanner.nextInt();
            if(pom == 5){
                a+=1;
            }
            else if(pom == 4){
                b+=1;
            }
            if(pom == 3){
                c+=1;
            }
            if(pom == 2){
                d+=1;
            }
        }
        System.out.println(d+" "+c+" "+b+" "+a);
    }
}
