package Strings;

public class printallsubstrings {
    public static void main(String[] args) {
        String str = "10101";
        for (int i=0 ; i<=3 ; i++){
            for (int j = i+1 ; j<=4 ;j++){
                System.out.print(str.substring(i,j) + "  ");//i -> included , j-> excluded
            }
        }
    }
}
