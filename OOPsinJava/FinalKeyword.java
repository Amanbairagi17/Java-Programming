package OOPsinJava;
//final
class First{

    final int age = 18;
    public final void m1(){
        System.out.println("This is a Final class");
    }
}
class Second extends First{// final class cannot inherited
//    public void m1(){//final method can not override
//        //Error ! -
//        System.out.println("This is my non final class");
//    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        First obj = new First();
       //obj.age=10; // final variable value can not change it remain constant
        //Error ! - age value can not change because age is final
        System.out.println(obj.age);
    }
}
