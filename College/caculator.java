package College;

public class caculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int Div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        int a =2;
        int b =8;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(Div(a,b));

    }
}
