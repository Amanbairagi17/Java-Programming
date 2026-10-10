package OOPsinJava.Enum;

public class Demo {
    enum Status{
        Pending,Running,Failed,Success ;
    }
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
//        System.out.println(s.getClass().getSuperclass());//class java.lang.Enum
//        Status[] ss = Status.values();
//        for (var s : ss){
//            System.out.println(s.ordinal()+" - "+s);



//        switch (s){
//            case Failed :
//                System.out.println("Good Try , Try Agian later");
//                 break;
//            case Pending :
//                System.out.println("Wait for sometime");
//                break;
//            case Running :
//                System.out.println("Please wait Proccess Pending");
//                break;
//            case Success :
//                System.out.println("Successfull");
//                break;
//            default:
//                System.out.println("Wrong Process");
//        }
//
//        if(s==Status.Pending){
//            System.out.println("All Good");
//        }
//        else if(s==Status.Running){
//            System.out.println("Please Wait");
//        } else if (s==Status.Failed) {
//            System.out.println("Try Again");
//        }
//        else {
//            System.out.println("Success");
//        }
    }
}
