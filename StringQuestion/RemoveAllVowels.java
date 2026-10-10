package StringQuestion;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String str = "Aman Bairagi";
        String result = "";

        for(char ch : str.toCharArray()){
            if(("aeiouAEIOU").indexOf(ch) == -1) result += ch;
        }
        System.out.println(result);
    }
}
