package SAP;

public class test {
    private static int yesterday = 1;
    int tommorrow = 10;
    public static void main(String[] args) {
        test test1 = new test();     //this have tommorw = 10
        int today = 20, tommorrow = 40;  //because tommorow is local variable for main method
        System.out.println(today + test1.tommorrow + test.yesterday);
    }
}
