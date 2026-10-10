package OOPsinJava;

public class WrapperClass {
    public static void main(String[] args) {
        int num =17;
        //Integer num1 = new Integer(7);// boxing
        Integer num1 = num;//auto-boxing

        //int num2 = num1.intValue();//unboxing
        int num2 = num1;// auto-unboxing

        String str = "18";
        int num3 = Integer.parseInt(str);//convert a string into a integer
       // System.out.println(str*2);
        System.out.println(num3*2);
    }
}
