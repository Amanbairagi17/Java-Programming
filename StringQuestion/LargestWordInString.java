package StringQuestion;

public class LargestWordInString {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        String[] words = str.split(" ");
        String largest = "";

        for(String word : words){
            if(word.length() > largest.length()){
                largest = word;
            }
        }
        System.out.println(largest);
    }
}
