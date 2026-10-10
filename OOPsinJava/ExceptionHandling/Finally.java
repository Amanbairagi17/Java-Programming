package OOPsinJava.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {
    public static void main(String[] args) throws IOException {
//         int num =0;
//        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
//        {
//            System.out.println("Enter Value : ");
////            InputStreamReader in = new InputStreamReader(System.in);
////            br = new BufferedReader(new InputStreamReader(System.in));
//            num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//        }
        int num = 0;
        BufferedReader br =null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }finally {
            br.close();
        }



    }
}
