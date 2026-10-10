package Strings;
import java.util.*;
public class builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Hello");
//        System.out.println(str);
//        str.setCharAt(0,'m');//setCharAt
//        System.out.println(str);//mello
//        str.append(30);//append
//        System.out.println(str);//mello30
//        str.insert(4,'a');//insert new char
//        System.out.println(str);//mellao30
//        str.deleteCharAt(6);//remove the value of idx 6 char
//        System.out.println(str);//mello0
        StringBuilder str1 = new StringBuilder("Programming");
        str1.reverse();
        System.out.println(str1);
        str1.delete(0,10);
        System.out.println(str1);
    }
}
