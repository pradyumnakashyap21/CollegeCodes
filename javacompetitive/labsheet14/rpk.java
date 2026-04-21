//LO2
package labsheet14;
import java.util.*;
public class rpk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String pattern = sc.next();

        int n = text.length();
        int m = pattern.length();
        int count = 0;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
            }
        }

        System.out.println(count);
        
    }
}


