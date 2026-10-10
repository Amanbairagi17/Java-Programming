package Regex;

import java.util.Scanner;

public class Masking2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder inputCode = new StringBuilder();

        int n = Integer.parseInt(sc.nextLine());


        // Read multi-line input
        while (n-- > 0) {
            inputCode.append(sc.nextLine()).append("\n");
        }

        String cleanedCode = cleanSourceCode(inputCode.toString());

        System.out.println(cleanedCode);
    }

    public static String cleanSourceCode(String code) {

        code = code.replaceAll("(API_KEY\\s*=\\s*\")[A-Za-z0-9]{20,}(\")", "$1********$2");

        code = code.replaceAll("(password\\s*=\\s*\").*?(\")", "$1********$2");

        code = code.replaceAll("(import\\s+[\\w\\.\\*]+;)(\\s*\\n\\s*)\\1", "$1");

        code = code.replaceAll(";{2,}", ";");

        return code;
    }
}
