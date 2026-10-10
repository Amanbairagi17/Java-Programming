package GenericTree;

import java.util.*;

import static java.util.Collections.reverse;

public class Basics {
    private static void formTree(Node root){
        root.child.add(new Node(3));
        root.child.add(new Node(5));
        root.child.add(new Node(1));
        root.child.get(0).child.add(new Node(34));
        root.child.get(0).child.add(new Node(33));
        root.child.get(0).child.add(new Node(35));
        root.child.get(1).child.add(new Node(24));
        root.child.get(1).child.add(new Node(25));
        root.child.get(1).child.add(new Node(20));
        root.child.get(2).child.add(new Node(11));
        root.child.get(2).child.add(new Node(41));
        root.child.get(2).child.add(new Node(44));
    }
    public static class Node{
        int val;
        List<Node> child;
        Node(int val){
            this.val=val;
            child=new ArrayList<>();
        }
    }
    public static void preOrderTraversal(Node root){
        if (root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        System.out.print(root.val+" ");
        int n = root.child.size();
        for(int i=0;i<n;i++){
            preOrderTraversal(root.child.get(i));
        }
    }
    public static void postOrderTraversal(Node root){
        if (root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }

        int n = root.child.size();
        for(int i=0;i<n;i++){
            postOrderTraversal(root.child.get(i));
        }
        System.out.print(root.val+" ");
    }
    static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.peek();
            System.out.print(curr.val+" ");
            q.remove();
            int n=curr.child.size();
            for (int i=0;i<n;i++){
                q.add(curr.child.get(i));
            }
        }
    }
    static void zigzagOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag =  false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
            while (size-- > 0) {
                Node currNode = q.peek();
                currLevel.add(currNode.val);
                q.remove();
                int n = currNode.child.size();
                for (int i = 0; i < n; i++) {
                    q.add(currNode.child.get(i));
                }
            }
            if (flag == false) {
                printList(currLevel);
            } else {
                reverse(currLevel);
                printList(currLevel);
            }
            flag=!flag;
        }  
    }
    public static int findMax(Node root){
        if (root.child.isEmpty()){
            return root.val;
        }
        int max = root.val;
        int n = root.child.size();
        for(int i=0;i<n;i++){
            int childMax = findMax(root.child.get(i));
            if (childMax>max) max=childMax;
        }
        return max;
    }
    public static void mirrorTree(Node root){
        int n = root.child.size();
        if (root.child.isEmpty() || n==1) return;
        for (int i=0;i<n;i++){
            mirrorTree(root.child.get(i));
            reverse(root.child);
        }
    }
    

    public static void printList(List<Integer> arr){
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        formTree(root);
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        levelOrderTraversal(root);
        System.out.println();
//        zigzagOrderTraversal(root);
      //  System.out.println(findMax(root));
        mirrorTree(root);
        levelOrderTraversal(root);

    }
}
