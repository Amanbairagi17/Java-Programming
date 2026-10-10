package Recursion;

public class KeypadCombination {
    static void combination(String dig,String[] kp, String res){
        if(dig.length()==0){
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String cuurChoices = kp[currNum];
        for (int i = 0 ; i<cuurChoices.length();i++){
            combination(dig.substring(1),kp,res+cuurChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s ="234";
        String [] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //               0  1   2     3     4     5     6     7      8     9
        combination(s,kp,"");
    }
}
