package OOPsinJava;
class Human{
//    private String name="Aman";
//    private int age =20;
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(21);// we are binding class instances with methods that called encapsulation
        h1.setName("Aman");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }
}
