package StringQuestion;

public class ContainsOnlyDigit {
    private static boolean isDigit(char ch){
        return ch == '0' ||
               ch == '1' ||
               ch == '2' ||
               ch == '3' ||
               ch == '4' ||
               ch == '5' ||
               ch == '6' ||
               ch == '7' ||
               ch == '8' ||
               ch == '9';
    }
    public static void main(String[] args) {
        String str = "23445567";

//        boolean b = true;
//        for(char ch : str.toCharArray()){
//            if(!isDigit(ch)) b =false;
//        }
//        if(b) System.out.println("true");
//        else System.out.println("false");
        if(str.matches("\\d+")) System.out.println("Yes");
        else System.out.println("No");
    }
}
