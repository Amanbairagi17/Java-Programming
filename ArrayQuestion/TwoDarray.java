package ArrayQuestion;

import java.util.Scanner;

public class TwoDarray {
    static void Print2Darray(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r= Sc.nextInt();
        System.out.println("Enter no. of column : ");
        int c= Sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " +r*c+ " values : ");
        for (int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]= Sc.nextInt();
            }
            System.out.println();
        }
//        int[][] arr= {  {2,3,4,},
//                          {6,8,9},
//                          {1,2,6}
//                       };
          Print2Darray(arr);
    }
}
