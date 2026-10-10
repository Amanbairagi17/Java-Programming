package StringQuestion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "Bhaihowru";
        int length = 0;

        for(char ch : str.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}
