//LO2
package javacompetitive.labsheet24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class mit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        boolean visited[][] = new boolean[n][n];

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{r,c});
        visited[r][c] = true;

        System.out.println("Reachable Squares");

        while(!queue.isEmpty()){

            int cur[] = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i=0;i<n;i++){

                if(!visited[x][i] && i!=y){
                    visited[x][i] = true;
                    System.out.println(x + " " + i);
                    queue.add(new int[]{x,i});
                }

                if(!visited[i][y] && i!=x){
                    visited[i][y] = true;
                    System.out.println(i + " " + y);
                    queue.add(new int[]{i,y});
                }
            }
        }

        sc.close();
    }

}
