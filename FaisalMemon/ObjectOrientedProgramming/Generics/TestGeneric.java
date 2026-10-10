package FaisalMemon.ObjectOrientedProgramming.Generics;

class Test2<T, U>{
    void show(Integer a, double b){
        System.out.println(a + " " + b);
    }
}
class Test<T>{
    void show(T a){
        System.out.println(a);
    }
}
public class TestGeneric {
    public static void main(String[] args) {
        Test<Integer> t = new Test<>();
        t.show(9);
        Test<Double> td = new Test<Double>();
        t.show(89);
        Test<String> ts = new Test<>();
        ts.show("Hii Aman");

        Test2<Integer,Double> i = new Test2<>();
        i.show(12,4.5);

    }
}
