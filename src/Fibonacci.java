import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("請依序輸入費式數列的值:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = Fas(n);
        System.out.println("Fas(" + n + ") = " + result);
    }

    public static int Fas(int n) {
        if (n < 2) {
            return n;
        } else {
            return Fas(n - 1) + Fas(n - 2);
        }
    }
}
