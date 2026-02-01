package labsheet4;
 import java.util.Scanner;
public class rr {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long result = factorial(n) / (factorial(k) * factorial(n - k));

        System.out.println(result);
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}


