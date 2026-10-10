package OOPsinJava.UMLPractice1;

public class Cricket {
    static {
        System.out.println("Cricket Stats...");
        System.out.println("After World Cup...");
    }

    static int runs;
    static int century;

    public static void rohit() {
        System.out.println("I am taking retirement.. What about you Virat ?");
        virat();
    }
    public static void bcci(){
        System.out.println("We will maks Shubhman as Captain ");
        gill();
    }
    public static void gill(){
        System.out.println("I am ready ");
    }

    public static void main(String[] args) {
        rohit();
    }
    public static void virat(){
        century = 100;
        System.out.println("I wanted to break record of Sachin+ " +runs+ " Centuries but ..");
        System.out.println("I Will also take retirement");
        bcci();
    }
}
