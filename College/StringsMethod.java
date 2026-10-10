package College;

public class StringsMethod {
    private static String covertIntoLowerCase(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 97 && ch <=122) sb.append(ch);
            else sb.append((char) (ch + 32));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String name ="welcome ";
        System.out.println(name.concat("to bhopal"));

        System.out.println(covertIntoLowerCase("HiiAman"));

    }
}