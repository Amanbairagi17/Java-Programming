package OOPsinJava.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
}
