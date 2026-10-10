package College;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int key = sc.nextInt();

        StringBuilder sb = new StringBuilder();




        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // shifting within alphabet (wrap-around)
                ch = (char) ((ch - base + key) % 26 + base);
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
