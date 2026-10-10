package College;

public class findAndReplace {
    public static void main(String[] args) {
        String str = "abcd";
        int[] indicies = {0,2};
        String[] source = {"ab","cd"};
        String[] target = {"eee","ffff"};
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<str.length() ; i++){
            String substring = str.substring(indicies[i],indicies[i]+source[i].length());
            if(str.contains(substring)) {
                sb.append(target[i]);
                i = i+source[i].length();
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
