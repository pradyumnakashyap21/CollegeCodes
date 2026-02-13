// LABSHEET 3 MODULAR POWER SUM
import java.util.Scanner;
public class kirr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int n, r;
        int sum = 0;

        for (int i = 0; i < a; i++) {
            n = sc.nextInt();
            r = sc.nextInt();
            int temp = 1;
            for (int j = 0; j < r; j++) {
                temp = temp * n;
            }
            temp = temp % b;      
            sum = sum + temp;   
        }
        sum = sum % b;
        System.out.println("the result will be: " + sum);
        System.out.println("20231CSE0120 R Pradyumna Kashyap");
        sc.close();
    }
}
