package Multithreading.concept.thread.priority;

class A extends Thread{
    public void run(){
        try{
            for(int i=0 ; i<=100 ; i++){
                System.out.println(Thread.currentThread().getName() + " : " +i);
                Thread.sleep(10);

            }
        } catch (Exception e) {
        throw new RuntimeException(e);
    }

    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();

        a.setName("Mera thread-1");
        a1.setName("Mera thread-2");
        a.setPriority(4);
        a1.setPriority(Thread.MAX_PRIORITY);
        a.start();
        a1.start();
    }
}
