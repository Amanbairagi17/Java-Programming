package OOPsinJava;
 class Person{
    private String name;

//     public void setName(String name,Person p1) {
//         Person p = p1;
//         p.name = name;
//    }


     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }
public class ThisKeyword {
    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.setName("Aman",p1);
        p1.setName("Aman");
        System.out.println(p1.getName());
    }
}
