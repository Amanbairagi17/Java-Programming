package OOPsinJava;

class X{
    public void show(){
        System.out.println("In x show");
    }
}
class Y extends X{
    @Override
    public void show() {
        System.out.println("In Y show");
    }
}
class Z extends X{
    public void show(){
        System.out.println("Z in show");
    }
}
public class DynamicPloymorphism {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();

        obj = new Y();
        obj.show();

        obj = new Z();
        obj.show();
    }
}
