package College;

import java.util.Scanner;

public class MoveHash {
    private static String solve(String str, int n){
        String str1 = new String("");
        String str2 = new String("");

        for(int i=0 ; i<n ; i++){
            if (str.charAt(i) == '#'){
                str1 = str.charAt(i) + str1;
            }
            else {
                str2 = str2 + str.charAt(i);
            }
        }
        String result = str1.concat(str2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (char ch : str.toCharArray()){
            if(ch == '#') count++;
        }
        StringBuilder sb = new StringBuilder();
        while (count -- > 0){
            sb.append('#');
        }
        for (int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) != '#') sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        //System.out.println(solve(str,str.length()));
    }
}
