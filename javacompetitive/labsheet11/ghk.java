import java.util.*;
public class ghk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
            total += prices[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
        System.out.println("Price = " + total);
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}
