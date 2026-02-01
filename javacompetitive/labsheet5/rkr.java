package labsheet5;
import java.util.Scanner;
public class rkr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   
        int r = sc.nextInt();   
        double a = 1, b = 1, c = 1;
        for (int i = 1; i <= r; i++) {
            a = a * (13 - i + 1) / i;
        }
        for (int i = 1; i <= (k - r); i++) {
            b = b * (39 - i + 1) / i;
        }
        for (int i = 1; i <= k; i++) {
            c = c * (52 - i + 1) / i;
        }

        double probability = (a * b) / c;

        System.out.printf("%.6f", probability);
        System.out.println("  ");
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}
