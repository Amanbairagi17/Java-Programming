package Regex;

import java.util.Scanner;

public class Masking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i=0 ; i<n ; i++){
            String line = sc.nextLine();

            System.out.println(processLine(line));
        }

    }

    private static String processLine(String line)
    {

        line = line.replaceAll("ID:[A-Z]{3}\\d{6}", "ID:XXX******");

        line = line.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})", "ACCT---$1");

        line = line.replaceAll("(?i)\\b(\\w+)(\\s+\\1\\b)+", "$1");

        line = line.replaceAll("([.!?])\\1+\\s*$", "$1");

        return line;
    }
}
