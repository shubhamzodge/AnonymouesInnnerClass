package LinkedList;

public class lastNode {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printLL(Node head) {

        while(head != null) {
            System.out.print(head.data);
            head = head.next;
            if(head != null) {
                System.out.print("->");
            }
        }
    }

    public static void remove(Node head, int k) {

        Node temp = head;
        int len = 0;

        while(temp != null) {
            temp = temp.next;
            len++;
        }
        k = len - k - 1;

        temp = head;

        while(k != 0) {
            temp = temp.next;
            k--;
        }
        temp.next = temp.next.next;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int k = 2;

        System.out.println("Before Deleting");
        System.out.println();
        printLL(head);
        remove(head, k);
        System.out.println("After Deleting");
        printLL(head);

    }
}