package ArrayQuestion;

import java.util.Scanner;

public class twoDArray3 {
    static int findSum(int[][] matrix, int l1 ,int r1, int l2, int r2){//brute force approach
        int sum = 0;
        for (int i = l1; i<=l2 ;i++){
            for (int j = r1 ; j <= r2 ;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
//    static void prefixSum(int [][] matrix){
//        int r = matrix.length;
//        int c = matrix[0].length;
//        //traverse horizontally to calculate row-wise prefix sum
//        for (int i = 0 ; i< r ;i++){
//            for (int j = 1 ; j< c ; j++){
//                matrix[i][j]+=matrix[i][j-1];
//            }
//        }
//    }
//    static int findSum2(int[][] matrix, int l1 ,int r1, int l2, int r2) {//using prefix sum of each horizontal row approach
//        int sum = 0;
//        prefixSum(matrix);
//        for (int i =l1 ; i<=l2 ;i++){
//            if (r1>0)
//                sum+=matrix[i][r2]-matrix[i][r1-1];
//            else
//                sum+=matrix[i][r2];
//        }
//        return sum;
//    }
    static void findPrefixSumMatrix(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //calculate horizontally sum of each row
        for (int i =0;i<r;i++){
            for (int j =1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        //calculate vertically sum of each column
        for (int j = 0;j<c;j++){
            for (int i =1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static int findSum3(int[][] matrix, int l1 ,int r1, int l2, int r2) {//using prefix sum of each horizontal row & vertically column both approach
    int sum=0,left=0,up=0,leftUp=0;
    findPrefixSumMatrix(matrix);

    sum    = matrix[l2][r2];
    if(r1 >= 1){
    left   = matrix[l2][r1-1];
    }
    if (l1 >= 1){
    up     = matrix[l1-1][r2];
    }
    if (l1 >= 1 && r1>=1){
    leftUp = matrix[l1-1][r1-1];
    }

    int ans = sum-up-left+leftUp;
    return ans;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column value : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
            System.out.println("Enter values of matrix : ");
        for (int i = 0;i<n;i++){
            for (int j =0 ;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundries l1,r1,l2,r2 : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int ans=findSum(matrix,l1,r1,l2,r2);//method for brute force approach
        System.out.println(ans);
            System.out.println(findSum3(matrix,l1,r1,l2,r2));

    }
}
