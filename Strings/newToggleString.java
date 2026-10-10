package Strings;

import java.util.Scanner;

public class newToggleString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        for(int i = 0; i<str.length() ; i++){
            boolean flag = true; // capital letter
            char ch = str.charAt(i);
            if(ch == ' ' ) continue;
            int asci = (int)ch;
            if(asci >= 97 ) flag = false;
            if(flag == true){
                asci+=32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
