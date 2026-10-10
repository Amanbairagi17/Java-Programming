package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String s = "a";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher("am");
        boolean result = matcher.matches();

        System.out.println("Result is : "+result);
    }
}
