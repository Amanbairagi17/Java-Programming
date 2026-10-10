package OOPsinJava;
class Man{
    String name;
    int age;
    Man(){}

    Man(String name){
        this.name=name;
    }
    Man(String name, int age){
        System.out.println(this.name=name);
        //this.age=age;

    }

    void display(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

}
public class Anonymous_Object {
    public static void main(String[] args) {
        new Man("Aman");//Anonymous object
        new Man("Kanha",21);
        new Man().display("Aman",21);
    }
}
