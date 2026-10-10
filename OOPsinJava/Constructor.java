package OOPsinJava;
class Persons{
    String name;
    int age;
    public Persons(String name, int age){
        this.name=name;
        this.age=age;
    }
     void display(){
        System.out.println("Name : "+ name + ", Age : " +age );
    }
}
public class Constructor {
    public static void main(String[] args) {
        Persons p1 = new Persons("Aman",21);
        Persons p2 = new Persons("Kanha",18);
        p1.display();
        p2.display();
    }
}
