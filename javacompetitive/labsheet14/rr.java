//LO1
package labsheet14;
import java.util.Scanner;

public class rr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String pattern = sc.next();

        int n = text.length();
        int m = pattern.length();
        boolean found = false;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Pattern Found");
        else
            System.out.println("Pattern Not Found");

        sc.close();
    }
}

