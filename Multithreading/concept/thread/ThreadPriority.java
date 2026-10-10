package Multithreading.concept.thread;

class MyThread extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
    }
}
public class ThreadPriority {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Hii Thread 1");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();//internally call run method
        t2.start();
//        t1.run();//normal
//        t2.run();
    }
}
