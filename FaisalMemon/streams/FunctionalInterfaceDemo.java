package FaisalMemon.streams;

@FunctionalInterface
interface BookAction{
    public void perform();
}

@FunctionalInterface
interface Operation{
    public int add(int a, int b);
}
public class FunctionalInterfaceDemo {
    //parameter -> {Expression Body}
    //() -> {}
    public static void main(String[] args) {
        //STEP 1
        BookAction b1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Hii Aman this book collection 1");
            }
        };
        b1.perform();

        //STEP 2
        BookAction b2 = () -> {
            System.out.println("Hii Aman this book collection 2");
        };
        b2.perform();

        //STEP 3
        BookAction b3 = () -> System.out.println("Hii Aman this book collection 3");
        b3.perform();

        //STEP 1
        Operation op1 = new Operation() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(op1.add(2,9));

        //STEP 2
        Operation op2 = (int a,int b) -> {
                return a+b;
        };
        System.out.println(op2.add(1,1));

        Operation op3 = (a,b) -> a+b;
        System.out.println(op3.add(2,4));

        //Thread interface
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread start");
            }
        }).start();

        //Thread interface
        new Thread(() -> {
                System.out.println("Second Thread start");
        }).start();

        new Thread(() -> System.out.println("Last Thread start")).start();


    }
}
