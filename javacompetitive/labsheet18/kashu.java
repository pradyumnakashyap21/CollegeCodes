//LO2
package labsheet18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kashu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int s = sc.nextInt();
        int d = sc.nextInt();

        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s] = true;

        boolean found = false;

        while(!q.isEmpty()){

            int node = q.poll();

            if(node == d){
                found = true;
                break;
            }

            for(int neighbor : graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        if(found)
            System.out.println("Connection Exists");
        else
            System.out.println("No Connection");

        sc.close();
    }

}
