package StringQuestion;

public class SwapCaseToggle {
    public static void main(String[] args) {
        String str = "AManBairAgI";
        String result = "";

        for(char ch : str.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') result += (char)(ch+32);
            else result += (char)(ch-32);
        }
        System.out.println(result);
    }
}
