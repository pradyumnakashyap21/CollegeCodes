package javacompetitive.labsheet22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Node {
    int id;
    int price;
    List<Node> children;

    Node(int id, int price) {
        this.id = id;
        this.price = price;
        this.children = new ArrayList<>();
    }
}

public class partone {
     public static int getTotal(Node root) {
        if (root == null)
            return 0;

        int total = root.price;

        for (Node child : root.children) {
            total += getTotal(child);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Map<Integer, Node> map = new HashMap<>();

       
        for (int i = 1; i <= n; i++) {
            map.put(i, new Node(i, 0));
        }
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int price = sc.nextInt();
            int childCount = sc.nextInt();

            Node current = map.get(id);
            current.price = price;

            for (int j = 0; j < childCount; j++) {
                int childId = sc.nextInt();
                current.children.add(map.get(childId));
            }
        }

        Node root = map.get(1);

        int total = getTotal(root);

        System.out.println("Total Price = " + total);
    }
}
