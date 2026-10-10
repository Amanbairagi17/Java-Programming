package OOPsinJava;
import java.util.*;

class Device
{
    int size;
    public void show(){
        System.out.println("System has some feature ...");
    }
    static class Mobile
    {
        public void config(){
            System.out.println("Some special Config...");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Device obj = new Device();
        obj.show();

        Device.Mobile obj1 = new Device.Mobile();
        obj1.config();
    }
}
