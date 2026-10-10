package College;

public class HCf {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;

        while (a != b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        System.out.println(a);
    }
}
