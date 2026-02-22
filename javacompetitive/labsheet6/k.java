package labsheet6;
import java.util.*;
public class k{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;  

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            result = result ^ num; 
        }
        System.out.println(result);
         System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}