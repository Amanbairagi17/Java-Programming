package LinkedList;

public class basicsOfLL {
    public  static void insertAtEnd(Node head , int val ){
        Node temp = new Node(val);
        Node t = head;
        while (t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static void displayRec(Node head){// Displaying the liked list using recursion
        if (head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void displayrec(Node head ){// print reverse liked list
        if (head==null) return;
        displayrec(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){// Displaying the liked list
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static int length(Node head ){
        Node temp = head ;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return  count;
    }
    public static class Node{
        int data;// value
        Node next;// address of next node
        public Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(6);
        Node c = new Node(34);
        Node d = new Node(9);
        Node e = new Node(1);
        // 4  6  34  9  1
        a.next=b;  // 4 ->  6  34  9  1
        b.next=c;  // 4 -> 6 -> 34  9  1
        c.next=d;  // 4 -> 6 -> 34 -> 9  1
        d.next=e;  // 4 -> 6 -> 34 -> 9 -> 1

        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        displayrec(a);
        System.out.println();
        System.out.println(length(a));
        insertAtEnd(a,56);
        display(a);
    }
}
