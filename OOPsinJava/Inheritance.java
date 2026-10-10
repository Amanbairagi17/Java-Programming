package OOPsinJava;
class Calc{//Base class
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
class AdvanceCalc extends Calc{//Derived class
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        AdvanceCalc op1 = new AdvanceCalc();
        int r1 = op1.add(2,4);
        int r2 = op1.sub(9,5);
        int r3 = op1.mul(2,6);
        int r4 = op1.div(15,3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
