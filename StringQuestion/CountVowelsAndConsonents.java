package StringQuestion;

public class CountVowelsAndConsonents {
    private static boolean isVowels(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        String s = "Aman Bairagi";
        int vowels = 0;
        int consonants = 0;

        for(char ch : s.toCharArray()){
            if(ch == ' ') continue;;
            char curr = Character.toLowerCase(ch);
            if(isVowels(curr)) vowels++;
            else consonants++;
        }
        System.out.println(vowels+ " : " +consonants);
    }
}
