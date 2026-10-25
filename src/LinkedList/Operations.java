package LinkedList;

public class Operations {
    int val;
    Operations next;
    Operations(int val){
        this.val = val;
    }
}
class Linkedlist3{
    Node head;
    Node tail;
    void insertAtHead(int data){
        Node newNode = new Node(data);

        //linked list is empty
        if(head==null){
            head= tail= newNode;
        }else{
            newNode.next= head;
            head = newNode;
        }
    }
    void insertAtTail(int data){
        Node newNode = new Node(data);

        //if list was empty
        if(head== null){
            head= tail= newNode;
        }else{
            tail.next = newNode;
            tail= newNode;
        }
    }
    public void removeAtHead(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        //only 1 node present
        if(head==tail){
            head= tail = null; //null B.coz we have to remove
        }
        else{
            head= head.next;
        }
    }
    public void removeAtTail(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        //only 1 node
        if(head==tail){
            head = tail= null;
            return;
        }
        //to find secondLast Node
        Node temp = head;
        while(temp.next!= tail){
            temp = temp.next;
        }
        temp.next=null;
        tail = temp;
    }
    public void deleteByValue(int value){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.val==value){
            removeAtHead();
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.val!=value){
            temp= temp.next;
        }
        if(temp.next!=null){
            if(temp.next==tail){
                tail=temp;
                temp.next =null;
            }
            else{
                temp.next =temp.next.next;
            }
        }
    }
    //Reverse LinkedList


    public void Display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
