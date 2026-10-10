package Stack;

import LinkedList.basicsOfLL;

public class implementationOfLL {
    public static class Node{// user define data type
        int val ;
        Node next;
        Node(int val ){
            this.val=val;
        }
    }
    public static class Stack{// user define data structure
        private Node head=null;
        private int size=0;
        void displayRec(Node head ){// print reverse liked list
            if (head==null) return;
            displayRec(head.next);
            System.out.print(head.val+" ");
        }
        void displayList(){
            displayRec(head);
            System.out.println();
        }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void push(int x){

            Node temp = new Node(x);
            temp.next=head;
            head = temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;

        }
        int peek(){
            if (head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        int size(){//getter
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(7);
        st.push(9);
        st.push(0);
        st.push(1);
        st.displayList();
        st.pop();
        st.displayList();
        st.peek();
    }
}
