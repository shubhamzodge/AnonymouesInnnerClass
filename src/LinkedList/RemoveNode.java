package LinkedList;

public class RemoveNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
        Node head;

        void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        //System.out.println(insertAtStart(10));
    }
}
