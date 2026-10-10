package LinkedList;

import java.security.PublicKey;
import java.util.Optional;

public class doublyLL {
    public static class Node{
        int data ;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while (temp.prev!=null){
            //Move this temp  backwards to the head
            temp=temp.prev;
        }
        //now temp is head
        // print list from the head node
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head , int x){
        Node t = new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtTail(Node head , int x){
        Node temp = head;
        while (temp.next!=null){//Temp ko le jao tail tk
            temp=temp.next;
        }
        Node t = new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtIndex(Node head , int idx , int x){
        Node s = head ;
        for (int i=1 ; i<=idx-1; i++){
            s=s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
//    public static Node delete(Node head ){//if only head node of the list is given
//        // If empty, return null
//        if (head == null) {
//            return null;
//        }
//
//        // Store in temp for deletion later
//        Node temp = head;
//
//        // Move head to the next node
//        head = head.next;
//
//        // Set prev of the new head
//        if (head != null) {
//            head.prev = null;
//        }
//
//        // Return new head
//        return head;
//    }
//    public static void delete(Node head ){//if only head node of the list is given and we need to delete the tail of the list
//        // Check if the list is empty
//        if (head == null) {
//            System.out.println("List is empty. Nothing to delete.");
//            return;
//        }
//
//        // Check if there's only one node in the list
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//
//        // Traverse to the last node (tail)
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        // Update the second last node's next pointer to null
//        if (temp.prev != null) {
//            temp.prev.next = null;
//        }
//    }

    public static void deleteAtIndex(Node head,int idx ){
        Node temp = head;
        for (int i=1 ;i<=idx-1 ; i++){
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(11);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(10);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
//        displayRev(e);
//        display2(c);
//        Node newHead = insertAtHead(a,36);
//        display(newHead);
        insertAtTail(a,23);
        display(a);
        insertAtIndex(a,3,17);
        display(a);
//        Node newHead = delete(a);
        deleteAtIndex(a,3);
        display(a);

    }
}
