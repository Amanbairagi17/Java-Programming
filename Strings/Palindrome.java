package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "A";
        str.toLowerCase().replaceAll("[^A-Za-z0-9]",null);
        int i =0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("not Palindrome ");
                flag = false;
                break;
            }
        i++;
            j--;
        }
        if(flag==true) System.out.println("Palindrome");
        else System.out.println("not Palindrome ");
    }
}
