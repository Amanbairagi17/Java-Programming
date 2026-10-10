package FaisalMemon.ObjectOrientedProgramming.LambdaFuctions;

interface A{
    int operation(int a, int b);
}
interface Fact{
    int fact(int n);
}
public class Test {
    public static void main(String[] args) {
        A r = (a,b) -> {return a+b;};
        System.out.println(r.operation(9,4));
        A r1 = (a, b) -> a * b;
        System.out.println(r1.operation(9,4));
        Fact f1 = (a) ->{
            int f=1;
            for(int i=a ; i>0 ; i--){
                f *= i;
            }
            return f;
        };
        System.out.println(f1.fact(6));

    }
}
