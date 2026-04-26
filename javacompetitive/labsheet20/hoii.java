import java.util.HashMap;
import java.util.Scanner;

class Node {
    int val;
    Node left, right;

    Node(int v){
        val = v;
        left = right = null;
    }
}

public class hoii {

    static void preorder(Node root){
        if(root != null){
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Node> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int node = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            Node curr = map.getOrDefault(node, new Node(node));
            map.put(node, curr);

            if(l != -1){
                Node left = map.getOrDefault(l, new Node(l));
                curr.left = left;
                map.put(l, left);
            }

            if(r != -1){
                Node right = map.getOrDefault(r, new Node(r));
                curr.right = right;
                map.put(r, right);
            }
        }

        Node root = map.get(1); // assuming root = 1

        System.out.println("Preorder Traversal");
        preorder(root);

        System.out.println("\nInorder Traversal");
        inorder(root);

        System.out.println("\nPostorder Traversal");
        postorder(root);

        sc.close();
    }
}