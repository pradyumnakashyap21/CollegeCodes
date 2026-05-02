package javacompetitive.labsheet29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


class Edge {
    int to, cost, time;

    Edge(int to, int cost, int time) {
        this.to = to;
        this.cost = cost;
        this.time = time;
    }
}

class State {
    int node, cost, time;

    State(int node, int cost, int time) {
        this.node = node;
        this.cost = cost;
        this.time = time;
    }
}
public class partone {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int cost = sc.nextInt();
            int time = sc.nextInt();

            graph.get(u).add(new Edge(v, cost, time));
            graph.get(v).add(new Edge(u, cost, time));
        }

        int source = sc.nextInt();
        int target = sc.nextInt();
        int maxTime = sc.nextInt();

        // dist[node][time] = min cost
        int[][] dist = new int[n + 1][maxTime + 1];

        for (int i = 0; i <= n; i++)
            Arrays.fill(dist[i], Integer.MAX_VALUE);

        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        pq.add(new State(source, 0, 0));
        dist[source][0] = 0;

        while (!pq.isEmpty()) {
            State curr = pq.poll();

            int u = curr.node;
            int cost = curr.cost;
            int time = curr.time;

            if (u == target) {
                System.out.println("Minimum cost within time = " + cost);
                return;
            }

            for (Edge e : graph.get(u)) {
                int v = e.to;
                int newTime = time + e.time;
                int newCost = cost + e.cost;

                if (newTime <= maxTime && newCost < dist[v][newTime]) {
                    dist[v][newTime] = newCost;
                    pq.add(new State(v, newCost, newTime));
                }
            }
        }

        System.out.println("No valid path within time constraint");
    }
}
