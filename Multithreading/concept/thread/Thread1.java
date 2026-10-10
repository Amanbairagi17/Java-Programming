package Multithreading.concept.thread;

public class Thread1 {
    public static void main(String[] args) {
        //Runnable Interface
        new Thread(() -> System.out.println("Functional interface runnable call")).start();
    }
}
