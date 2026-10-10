package LinkedList;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
    public static Node reverseRecursive(Node head){
        if (head.next==null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        // 4  6  34  9  1
        a.next=b;  // 4 ->  6  34  9  1
        b.next=c;  // 4 -> 6 -> 34  9  1
        c.next=d;  // 4 -> 6 -> 34 -> 9  1
        d.next=e;  // 4 -> 6 -> 34 -> 9 -> 1
        display(a);
        System.out.println();
        a=reverse(a);
        display(a);
    }
}
