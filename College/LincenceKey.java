package College;

public class LincenceKey {
    public static void main(String[] args) {
        String str = "5a3z-2e-9-w";
        int k = 3;

        StringBuilder sb = new StringBuilder();
        int curr = 0;

        for(char ch : str.toCharArray()){
            if(ch == '-') continue;

            sb.append(ch);
            curr++;
            if(curr == k){
                curr = 0;
                sb.append("-");
            }
        }
        if(sb.charAt(sb.length()-1) == '-') sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
