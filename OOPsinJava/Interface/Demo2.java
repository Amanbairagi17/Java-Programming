package OOPsinJava.Interface;

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code() {
        System.out.println("Work on Laptop ......");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Work on Desktop ...... ");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer aman = new Developer();
        aman.devApp(desk);
        aman.devApp(lap);
    }
}
