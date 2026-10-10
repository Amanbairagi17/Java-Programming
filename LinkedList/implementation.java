package LinkedList;

public class implementation {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size;

        void insertAtEnd(int val){// insert value at the end of the list(tail)
            Node temp = new Node(val);
            if (head==null){ // if list is empty
                head = temp;
            }
            else { // list is nonEmpty
                tail.next = temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if (head==null){// empty list
               // head=tail=temp;
                insertAtEnd(val );
            }
            else{// nonEmpty list
                temp.next=head;
                head= temp;
            }
            size++;
        }
        void insertAt(int idx , int   val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==size){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            } else if (idx<0 || idx>size) {
                System.out.println("wrong index");
                return;
            }
            for (int i=1 ; i<=idx-1 ; i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int idx ){
            Node temp = head;
            if (idx<0 || idx>size) {
                System.out.println("wrong index");
                return -1;
            }
            for (int i=1 ;i<=idx ;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp = head;
            if (idx==0) {
                head=head.next;
                size--;
            }
            if (idx==size-1) {
                tail = temp;
                size--;
            }

            for (int i=1 ; i<=idx-1 ; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
        void display(){
            Node temp = head ;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
//        int size(){
//            Node temp = head ;
//            int count = 0 ;
//            while (temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }

    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAt(2,5);

        System.out.println(ll.tail.data);
    }
}
