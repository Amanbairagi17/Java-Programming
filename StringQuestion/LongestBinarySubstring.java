package StringQuestion;

public class LongestBinarySubstring {
    public static void main(String[] args) {
        String str = "01000111";

        int res = 0;
        int i=0;
        int j=0;
        while (i<str.length()){
            int countOnes =0;
            int countZeros = 0;

            while (i<str.length() && str.charAt(i) == '0'){
                countZeros++;
                i++;
            }
            j=i;

            while (j<str.length() && str.charAt(j) == '1'){
                countOnes++;
                j++;
            }
            res = Math.max(res, 2 * Math.min(countOnes,countZeros));
            i=j;
        }
        System.out.println(res);
//         String temp = "01";
//         while(temp.length() <= str.length()){
//             if(str.contains(temp))
//                 res = temp.length();
//             temp = "0" + temp + "1";
//         }
//        System.out.println(res);
    }
}
