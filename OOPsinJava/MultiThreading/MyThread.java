package OOPsinJava.MultiThreading;

public class MyThread extends Thread{
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
        }

        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            t1.setPriority(Thread.MIN_PRIORITY); // Setting priority to 1
            t2.setPriority(Thread.MAX_PRIORITY); // Setting priority to 10

            t1.start();
            t2.start();
        }

}
