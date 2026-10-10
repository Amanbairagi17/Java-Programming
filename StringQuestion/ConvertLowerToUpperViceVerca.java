package StringQuestion;

import java.util.SplittableRandom;

public class ConvertLowerToUpperViceVerca {
    public static void main(String[] args) {
        String str = "AmanBairagi";

        String upper = "";
        String lower = "";

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') upper += (char) (c - 32);
            else upper += c;

            if (c >= 'A' && c <= 'Z') lower += (char) (c + 32);
            else lower += c;
        }
        System.out.println(upper);
        System.out.println(lower);

    }
}
