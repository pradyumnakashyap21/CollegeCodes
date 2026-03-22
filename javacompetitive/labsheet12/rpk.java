package labsheet12;
import java.util.Scanner;

public class rpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minimum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("Minimum = " + minimum);
        System.out.println("20231CSE0120 R Pradyumna Kashyap");
    }
}
