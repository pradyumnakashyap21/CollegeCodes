package javacompetitive.labsheet27;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class partone {
    static int[] parent;

    // Find with Path Compression
    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    // Union
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parent[rootA] = rootB;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        System.out.print("Enter number of friendships: ");
        int m = sc.nextInt();

        parent = new int[n + 1];

        // Initialize DSU
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        // Input friendships
        System.out.println("Enter friendships (u v):");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            union(u, v);
        }

        // Count components
        Set<Integer> components = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            components.add(find(i));
        }

        int result = components.size() - 1;

        System.out.println("Minimum new friendships required = " + result);
    }
}
