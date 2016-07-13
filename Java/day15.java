import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

// all instances of "day15" below renamed from Solution for easier compilation
public class day15
{
    public static Node insert(Node head, int data) {
        // Complete this method
        if (head == null)
            return new Node(data);
        else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            Node new_node = new Node(data);
            current.next = new_node;
            return head;
        }
	}

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
    }
}