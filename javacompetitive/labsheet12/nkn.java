package labsheet12;

import java.util.Scanner;

public class nkn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int minS = s[0];
        for (int i = 1; i < n; i++) {
            if (s[i] < minS) {
                minS = s[i];
            }
        }

        double time = (double) d / minS;

        System.out.println("Min Speed = " + minS);
        System.out.printf("Max Time = %.2f hours\n", time);
        System.out.println("20231CSE0120 R Pradyumna Kashyap");
    }
}

