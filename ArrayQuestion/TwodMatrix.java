package ArrayQuestion;

import java.util.Scanner;

public class TwodMatrix {
    static void printMatrix(int[][] arr ){
        for (int i =0 ;i< arr.length ;i++){
            for (int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int[][] Matrix,int r ,int c){
        int topRow =0,bottomRow=r-1 ,leftColumn =0,rightColumn=c-1;
        int topElement=0;
        while(topElement<=r*c){
            //topRow -> leftColumn to rightColumn
            for (int j =leftColumn;j<=rightColumn && topElement <= r*c  ; j++){
                System.out.print(Matrix[topRow][j]+ " ");
                topElement++;
            }
            topRow++;
            //rightColumn -> topRow to bottomRow
            for (int i = topRow;i<=bottomRow && topElement <= r*c;i++){
                System.out.print(Matrix[i][rightColumn] + " ");
                topElement++;
            }
            rightColumn--;
            // bottomRow ->rightColumn to leftColumn
            for(int j =rightColumn;j>=leftColumn && topElement <= r*c;j--){
                System.out.print(Matrix[bottomRow][j]+ " ");
                topElement++;
            }
            bottomRow--;
            //leftColumn -> bottomRow ti topRow
            for (int i = bottomRow;i>=topRow  && topElement <= r*c;i--){
                System.out.print(Matrix[i][leftColumn]+ " ");
                topElement++;
            }
            leftColumn++;
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter row & column : ");
        int r=Sc.nextInt();
        int c= Sc.nextInt();
        int ele =r*c;
        System.out.println("Enter " + ele + " value of matrix : ");
        int[][] Matrix = new int[r][c];
        for (int i =0;i< Matrix.length;i++){
            for (int j =0;j< Matrix[i].length;j++){
                Matrix[i][j]= Sc.nextInt();
            }
        }
        System.out.println("Print Original Matrix : ");
        printMatrix(Matrix);
        System.out.println("Spiral order : ");
        spiralMatrix(Matrix,r,c);
    }

}
