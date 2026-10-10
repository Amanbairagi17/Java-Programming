package StringQuestion;

public class RotationalStrings {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "acbd";
        String str = str1+str1;

        if (str.contains(str2)) System.out.println("yes");
        else System.out.println("No");
    }
}
