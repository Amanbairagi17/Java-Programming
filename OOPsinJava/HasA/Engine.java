package OOPsinJava.HasA;

public class Engine {
    int hp;
    String engineNo;

    public Engine(int hp, String engineNo) {
        this.hp = hp;
        this.engineNo = engineNo;
    }
    void start(){
        System.out.println( engineNo+ " Engine is  Started......");
    }

}
