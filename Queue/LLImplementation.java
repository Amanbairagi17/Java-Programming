package Queue;

public class LLImplementation {
    public static class Node {// user define data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static class queueLL {// user define data structure
        Node head = null;
        Node tail = null;
        int size=0;
        void add(int x){
            Node temp = new Node(x);
            if (size==0){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        int remove(){
            if (head==null) {
                System.out.println("Queue is empty ");
                return -1;
            }
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if (head==null) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return head.val;
        }
        void display(){
            if (size==0){
                System.out.println("Queue is empty ");
                return;
            }
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        q.isEmpty();
        q.add(2);
        q.add(5);
        q.display();
        q.add(10);
        q.add(23);
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
