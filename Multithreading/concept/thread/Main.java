package Multithreading.concept.thread;
class A extends Thread{
    public void run(){
        for(int i=0 ; i<=100 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0 ; i<=100 ; i++){
            System.out.println("Hello");
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        a.start();//parallel execution order not fixed
        Thread.sleep(2000);
        a.interrupt();
      //  b.start();
//        a.run();// order sequential
//        b.run();
    }
}
