package OOPsinJava.ExceptionHandling;
//class A{
//    public void show(){
//        try {
//            Class.forName("OOPsinJava.ExceptionHandling.Example");
//        }catch (ClassNotFoundException e){
//            System.out.println("there is an exception"+e);
//        }
//    }
//}
class A{
    public void show() throws ClassNotFoundException{
            Class.forName("Calc");
    }
}
public class Example {
    static {
        System.out.println("Class Loader");
    }
    public static void main(String[] args)  throws ClassNotFoundException{
        A obj = new A();
        obj.show() ;
    }
}
