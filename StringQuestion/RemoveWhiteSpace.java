package StringQuestion;

public class RemoveWhiteSpace {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String str = "Hii aman how are you";
        String result = "";
        for (char ch : str.toCharArray()){
            if(ch != ' ') result += ch;
        }
        System.out.println(result);
         result= " hii ram now ank to aman/n" + result;
        System.out.println(countWords(result));


    }
}
