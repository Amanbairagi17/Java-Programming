package DSAPractice.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.function.IntBinaryOperator;

public class Problem1 {

   //Post-Order without using recursion
   private static List<Integer> postOrderUsingRec(Node root){
      ArrayList<Integer> arr = new ArrayList<>();
      if (root == null) return arr;

      Stack<Node> st = new Stack<>();
      st.push(root);

      while (!st.isEmpty()) {
         Node temp = st.pop();
         arr.add(temp.val);

         if (temp.left != null) st.push(temp.left);
         if (temp.right != null) st.push(temp.right);
      }

      Collections.reverse(arr);
      return arr;
   }
   //In-Order with stack
   private static List<Integer> inOrderWithoutRec(Node root){
      ArrayList<Integer> arr = new ArrayList<>();
      if(root == null) return arr;

      Stack<Node> st = new Stack<>();
      st.push(root);

      while (st.size() > 0){
         Node temp = st.peek();
         if(temp.left != null){
            st.push(temp.left);
            temp.left = null;
         }
         else {
            st.pop();
            arr.add(temp.val);
            if(temp.right != null) st.push(temp.right);
            temp.right = null;
         }
      }
      return arr;
   }
   //Pre-Order with stack
   private static List<Integer> preOrderWithoutRec(Node root){
      ArrayList<Integer> arr = new ArrayList<>();
      if(root == null) return arr;

      Stack<Node> st = new Stack<>();
      st.push(root);

      while(!st.isEmpty()){
         Node temp = st.pop();
         arr.add(temp.val);
         if(temp.right != null) st.push(temp.right);
         if(temp.left != null) st.push(temp.left);
      }
      return arr;
   }

   //count nodes in a binary tree
   private static int countNodes(Node root){
      if(root == null) return 0;
      return 1+ countNodes(root.left) + countNodes(root.right);
   }
   //height of tree
   public static int height(Node root) {
      if(root == null) return 0;
      if(root.left == null && root.right == null ) return 1;
      return 1 + Math.max(height(root.left),height(root.right));
   }
   //PreOrder traversal of tree
   private static void preOrder(Node root){
      if(root == null) return ;
      System.out.print(root.val+" -> ");
      preOrder(root.left);
      preOrder(root.right);

   }
   //inoder traversal of tree
   private static void inOrder(Node root){
      if(root == null) return ;
      inOrder(root.left);
      System.out.print(root.val+" -> ");
      inOrder(root.right);

   }
   //PostOrder traversal of tree
   private static void PostOrder(Node root){
      if(root == null) return ;
      PostOrder(root.left);
      PostOrder(root.right);
      System.out.print(root.val+" -> ");
   }

   //count number of leaf node
   private static int countLeafNode(Node root){
      if(root == null) return 0;
      if(root.left == null && root.right == null) return 1;
      return  countLeafNode(root.left) + countLeafNode(root.right);
   }

    public static void main(String[] args) {
       Node root = new Node(2);

       //a<-root->b
       Node a = new Node(10);
       Node b = new Node(5);

       root.left = a;
       root.right = b;

       //c<-a->d
       Node c = new Node(9);
       Node d = new Node(30);

       a.left = c;
       a.right = d;

       //e<-b->f
       Node e = new Node(45);
       Node f = new Node(23);

       b.left= e;
       b.right = f;

       System.out.print("Pre-Order Traversal of Tree : " );
       preOrder(root);
       System.out.println();
       System.out.print("In-Order Traversal of Tree : " );
       inOrder(root);
       System.out.println();
       System.out.print("Post-Order Traversal of Tree : " );
       PostOrder(root);
       System.out.println();

       System.out.println("Height of tree : " +height(root));
       System.out.println("Count Node in tree : " +countNodes(root));
       System.out.println("Number of leaf Nodes in tree : " +countLeafNode(root));
       System.out.println("Pre-Order Traversal without using stack : " + preOrderWithoutRec(root));
       System.out.println("In-Order Traversal without using stack : " + inOrderWithoutRec(root));
      // System.out.println("Post-Order Traversal without using stack : " + postOrderUsingRec(root));
    }
}
