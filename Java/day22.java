import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class day22
{
    public static int getHeight(Node root) {
        // Write your code here
        if (root == null)
            return 0;
        else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return (1 + (left > right ? left : right));
        }
    }

    public static Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        else {
            Node cur = new Node(data);
            if (data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }	
}