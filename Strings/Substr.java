package Strings;
import java.util.*;
public class Substr {
    public static void main(String[] args) {
        String str = "Kanha";
       // System.out.println(str.substring(0,6));
       // System.out.println(str.substring(4));
        for (int i = 0 ; i<5 ; i++){
            for (int j = i+1 ;j<=5 ;j++) {
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
