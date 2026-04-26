//LO1
package javacompetitive.labsheet24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Cell {
    int r, c, moves;

    Cell(int r, int c, int moves){
        this.r = r;
        this.c = c;
        this.moves = moves;
    }
}


public class hii {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sr = sc.nextInt();
        int sc1 = sc.nextInt();
        int tr = sc.nextInt();
        int tc = sc.nextInt();

        boolean[][] visited = new boolean[n][n];

        Queue<Cell> queue = new LinkedList<>();

        queue.add(new Cell(sr, sc1, 0));
        visited[sr][sc1] = true;

        while(!queue.isEmpty()){

            Cell cur = queue.poll();

            if(cur.r == tr && cur.c == tc){
                System.out.println(cur.moves);
                break;
            }

            for(int i=0;i<n;i++){

                if(!visited[cur.r][i]){
                    visited[cur.r][i] = true;
                    queue.add(new Cell(cur.r, i, cur.moves+1));
                }

                if(!visited[i][cur.c]){
                    visited[i][cur.c] = true;
                    queue.add(new Cell(i, cur.c, cur.moves+1));
                }
            }
        }

        sc.close();
    }
}
