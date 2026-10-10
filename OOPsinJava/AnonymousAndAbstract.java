package OOPsinJava;
abstract class Aaa{
    public abstract void show();
    public abstract void config();
}
public class AnonymousAndAbstract {
    public static void main(String[] args) {
        Aaa obj = new Aaa() {
            public void show() {
                System.out.println("In new show");
            }
            public void config() {
                System.out.println("In anonymous class config");
            }
        };
        obj.show();
        obj.config();
    }
}
