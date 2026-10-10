package Strings;
import java.util.*;

public class interningString {
    public static void main(String[] args) {
        String s ="Hello";
//        String x ="Hello";// it take same address in the memory
//        x="Mello";//no extra memory space created for it
//        System.out.println(s);
//        System.out.println(x);
        String str = new String("Hello");// new memory allocate for this string
        System.out.println(str);

        //immutability in strings
        //change it heylo
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
