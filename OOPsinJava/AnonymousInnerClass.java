package OOPsinJava;

class Aa{
    public void show(){
        System.out.println("Show in AAA");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Aa obj = new Aa(){
            public void show(){
                System.out.println("show in Main");
            }
        };
        obj.show();
    }
}
