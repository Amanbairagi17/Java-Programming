package LinkedList;

public class nthNodefromLast {
//    public static Node nthNode(Node head ,int n){//Here we traverse in list 2 time which is 2*O(n) and we need to traverse list only once
//
//        int size=0;
//        Node temp=head;
//        while (temp!=head){
//            size++;
//            temp=temp.next;
//        }
//        int m =size-n+1;
//        temp=head;
//        for (int i=1 ;i<=m-1 ;i++){
//            temp=temp.next;
//        }
//        return temp;
//    }
public static Node nthNode(Node head ,int n){//Traverse only one time to the list
    Node slow = head;
    Node fast = head;
    for (int i=1 ;i<=n ;i++){
        fast=fast.next;
    }
    while (fast!=null){
        fast=fast.next;
        slow=slow.next;
    }
    return slow;
}
public static void display(Node head ){
    Node temp = head ;
    while (temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
public static Node nthNodeFromLast(Node head,int n){
    Node slow = head;
    Node fast= head;
    for (int i=1 ; i<=n ;i++){
        fast=fast.next;
    }
    if (fast==null){
        head=head.next;
        return head;
    }
    while (fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return head;
}
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(45);
        Node b = new Node(4);
        Node c = new Node(42);
        Node d = new Node(15);
        Node e = new Node(65);
        Node f = new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp = nthNode(a,3);
        display(a);
        a= nthNodeFromLast(a,6);
        display(a);
        System.out.println();







    }
}
