package Trees;

public class maxSumValSizeHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    //Height of binary tree
    public static int height(Node root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    //size of binary tree
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left) + size(root.right);
    }
    // sum of binary tree
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left) + sum(root.right);
    }
    //max value in binary tree
    public static int max(Node root){
        if (root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    //Min Value of the tree
    public static int min(Node root){
        if (root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    //product of the binary tree
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        Node a = new Node(-4);
        Node b = new Node(2);
        root.left=a;
        root.right=b;
        Node c = new Node(3);
        Node d = new Node(-4);
        a.left=c;
        a.right=d;
        Node e = new Node(5);
        Node f = new Node(6);
        b.right=e;
        b.left=f;
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(min(root));
        System.out.println(product(root));
    }
}
