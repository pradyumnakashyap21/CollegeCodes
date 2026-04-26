package labsheet20;

import java.util.HashMap;
import java.util.Scanner;

class Node {
    int name;
    Node left, right;

    Node(int name){
        this.name = name;
        left = right = null;
    }
}

public class kash {
        static void preorder(Node root){
        if(root != null){
            System.out.print(root.name + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Node> map = new HashMap<>();

        for(int i=0;i<n;i++){

            int node = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            Node current = map.getOrDefault(node,new Node(node));
            map.put(node,current);

            if(l != -1){
                Node left = new Node(l);
                current.left = left;
                map.put(l,left);
            }

            if(r != -1){
                Node right = new Node(r);
                current.right = right;
                map.put(r,right);
            }
        }

        Node root = map.get(1);

        System.out.println("File System Traversal (Preorder)");
        preorder(root);

        sc.close();
    }

}
