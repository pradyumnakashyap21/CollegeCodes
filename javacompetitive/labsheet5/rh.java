package labsheet5;
 import java.util.Scanner;
public class rh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int D = sc.nextInt(); 
        int K = sc.nextInt();
        int R = sc.nextInt(); 
        double a = 1, b = 1, c = 1;
        
        for (int i = 1; i <= R; i++) {
            a = a * (D - i + 1) / i;
        }
        for (int i = 1; i <= (K - R); i++) {
            b = b * ((N - D) - i + 1) / i;
        }
        for (int i = 1; i <= K; i++) {
            c = c * (N - i + 1) / i;
        }
        double probability = (a * b) / c;
        System.out.printf("%.6f", probability);
        System.out.println("  ");
        System.out.println("R Pradyumna Kashyap 20231CSE0120");
    }
}

