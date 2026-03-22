
import java.util.Scanner;

public class hkh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            total += prices[i] * sc.nextInt();
        }

        System.out.println(total);
        System.out.println("R Pradyumna 20231CSE0120");
    }
}


