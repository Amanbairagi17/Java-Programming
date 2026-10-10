package Trees;

import java.io.FilterOutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static class Node{
        int val ;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    //PreOrder - Root->Left->Right
    public static void preOrder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //InOrder - Left->Root->Right
    public static void inOrder(Node root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //PostOrder - Left->Right->Root
    public static void postOrder(Node root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    //nthLevel of elements
    public static void nthlLevel(Node root , int n){
        if (root==null) return;
        if (n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthlLevel(root.left,n-1);
        nthlLevel(root.right,n-1);
    }
    public static int height(Node root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    //breadth first search
    public static void bfs(Node root){//Iterative
        Queue<Node> q = new LinkedList<>();
        if (root!=null) q.add(root);
        while (q.size()>0){
            Node temp=q.peek();
            if (temp.left!=null) q.add(temp.left);
            if (temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left=e;
        b.right=f;
        preOrder(root);// 1 2 4 5 3 7 6
        System.out.println();
        inOrder(root);//4 2 5 1 6 3 7
        System.out.println();
        postOrder(root);//4 5 2 7 6 3 1
        System.out.println();

//        int level=height(root)+1;
//        for (int i=1;i<=level;i++) {
//            nthlLevel(root, i);
//            System.out.println();
//        }
        bfs(root);


    }
}
