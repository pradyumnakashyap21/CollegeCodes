package javacompetitive.labsheet26;

import java.util.Scanner;

public class parttwo {
        static int parent[];
    static int rank[];

    static int find(int x){
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    static void union(int a, int b){

        int rootA = find(a);
        int rootB = find(b);

        if(rootA != rootB){

            if(rank[rootA] < rank[rootB])
                parent[rootA] = rootB;

            else if(rank[rootA] > rank[rootB])
                parent[rootB] = rootA;

            else{
                parent[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n+1];
        rank = new int[n+1];

        for(int i=1;i<=n;i++)
            parent[i] = i;

        for(int i=0;i<m;i++){

            String op = sc.next();

            if(op.equals("union")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                union(a,b);
            }

            else if(op.equals("check")){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(find(a) == find(b))
                    System.out.println("Connected");
                else
                    System.out.println("Not Connected");
            }
        }

        sc.close();
    }

}
