package LinkedList;
//overall insert at head,tail,delete at head
public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

    class Linkedlist {
        Node head;
        Node tail;

        void insertAtHead(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ->");
                temp = temp.next;
            }
            System.out.print("null");
        }
        public void removeAtHead(){
            // list is empty
            if(head ==null){
                System.out.println("list is empty");
                return;
            }
            // only node
            if(head == tail){
                head = tail = null;
            }
            // more elements
            else{
                head = head.next;

            }
        }

        public static void main(String[] args) {
            Linkedlist ll = new Linkedlist();
            ll.insertAtHead(10);
            ll.insertAtHead(20);
            ll.insertAtHead(30);
            ll.insertAtHead(40);
            ll.insertAtTail(500);

            ll.display();
            ll.removeAtHead();
            System.out.println();
            ll.display();

        }
    }



