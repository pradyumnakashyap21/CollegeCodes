//LO1
package labsheet19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
class Pair {
    int node, dist;

    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class rpk {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Pair(v,w));
            graph.get(v).add(new Pair(u,w));
        }

        int source = sc.nextInt();

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> a.dist - b.dist
        );

        pq.add(new Pair(source,0));

        while(!pq.isEmpty()){

            Pair p = pq.poll();

            for(Pair neighbor : graph.get(p.node)){

                int newDist = p.dist + neighbor.dist;

                if(newDist < dist[neighbor.node]){
                    dist[neighbor.node] = newDist;
                    pq.add(new Pair(neighbor.node,newDist));
                }
            }
        }

        System.out.println("Shortest distances from source node " + source);

        for(int i=0;i<n;i++)
            System.out.println(i + " -> " + dist[i]);

        sc.close();
    }

}
