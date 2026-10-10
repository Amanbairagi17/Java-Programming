package OOPsinJava.MultiThreading;
class A1 extends Thread{
    public void run(){
        for (int i=0 ; i<=100 ; i++){
            System.out.println("Hii Aman ");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class A2 extends Thread{
    public void run(){
        for (int i=0 ; i<=100 ; i++){
            System.out.println("Hello Aman ");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Sleep {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        A2 obj2 = new A2();
        obj2.getPriority();
        obj1.getPriority();
        obj1.start();
        obj2.start();
    }
}
