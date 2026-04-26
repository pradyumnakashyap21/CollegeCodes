package labsheet16;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class hehe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Highest Bid: " + pq.poll());
        if (!pq.isEmpty()) {
            System.out.println("Next Highest Bid: " + pq.poll());
        }
        sc.close();
    }
}


