package StringQuestion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abba";
        int n = str.length();

        int i=0 ;
        int j=n-1;

        boolean check = true;

        while (i < j){
            if(str.charAt(i) != str.charAt(j)) check = false;
            i++;
            j--;
        }
        if(check) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
