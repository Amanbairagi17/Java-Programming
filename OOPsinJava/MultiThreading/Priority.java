package OOPsinJava.MultiThreading;
class AA extends Thread{
    public void run(){
        for (int i=0 ; i<=10 ; i++){
            System.out.println("Hii Aman ");
        }
    }
}
class BB extends  Thread{
    public void run(){
        for (int i=0 ; i<=10 ; i++){
            System.out.println("Hello Aman ");
        }
    }
}
public class Priority {
    public static void main(String[] args) {
        AA obj1 = new AA();
        BB obj2 = new BB();

        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
