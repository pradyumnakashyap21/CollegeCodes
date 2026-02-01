package labsheet4;
//Ncr labsheet 5
import java.util.Scanner;

public class rpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        r = Math.min(r, n - r);
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }
        System.out.println(result);
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}
