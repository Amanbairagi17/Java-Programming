package College;
import java.util.*;

public class immutability {
    public static void main(String[] args) {
      //  String s1 = "Hello ";//Here 1 Object are created
        String s1 = new String("Hello");
        s1=s1.concat("Harsh");//
        s1=s1.concat(" Aman");
        System.out.println(s1);
    }
}
