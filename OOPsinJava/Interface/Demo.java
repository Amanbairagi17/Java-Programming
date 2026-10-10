package OOPsinJava.Interface;

import java.util.Objects;

interface A{
    int age=21;// final or static


    void show();// public abstract
    void config();

}
interface X{
    String name = "Aman";
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("Interface implemented");
    }
    public void config() {
        System.out.println("Config ..........");
    }
    public void run(){
        System.out.println("Running ...");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new B();

        System.out.println(A.age);
        obj.show();
        obj.config();

        System.out.println();

        X obj1 = new B();
        System.out.println(X.name);
        obj1.run();
    }
}
