package OOPsinJava.Interface;
@FunctionalInterface
interface AA{
    int add(int i, int j);
  //  void printer(String msg);
}
//class Bb implements a{
//
//     public void show() {
//        System.out.println("In Class B ");
//    }
//}

public class Functional {
    public static void main(String[] args) {

        AA c = (i,j) -> i+j;
        System.out.println("Sum " +c.add(10,20));
//        AA obj = (msg) -> {
//            System.out.println("Message Recieved : ");
//            System.out.println(msg);
//        };
//        obj.printer("Hii Aman ! ");

    }
}
