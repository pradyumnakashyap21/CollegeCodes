package labsheet13;

import java.util.*;

public class hk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] length = new int[n];
        int[] speed = new int[n];

        for (int i = 0; i < n; i++) {
            length[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            speed[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        double maxTime = 0;

        while (left <= right) {
            double t1 = (double) length[left] / speed[left];
            double t2 = (double) length[right] / speed[right];

            maxTime = Math.max(maxTime, Math.max(t1, t2));

            left++;
            right--;
        }

        System.out.print((int) Math.ceil(maxTime));
        System.out.println("20231CSE0120 R Pradyumna Kashyap");
    }
}