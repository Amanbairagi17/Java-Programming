package SAP;

import javax.swing.plaf.IconUIResource;

public class CountAndSay {
    public static void main(String[] args) {
        String str = "abdda";
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=str.length()-1 ; i>=0 ; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

        for(int i=0 ; i<str.length() ; i++){
            if(sb.charAt(i) == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
