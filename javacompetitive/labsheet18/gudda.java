//LO1
package labsheet18;

import java.util.ArrayList;
import java.util.Scanner;

public class gudda {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] matrix = new int[n][n];

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            matrix[v][u] = 1;

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.println("Adjacency Matrix");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Adjacency List");

        for(int i=0;i<n;i++){
            System.out.print(i+" -> ");
            for(int v: graph.get(i))
                System.out.print(v+" ");
            System.out.println();
        }

        sc.close();
    }

}
