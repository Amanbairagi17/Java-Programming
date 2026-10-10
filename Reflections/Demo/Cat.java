package Reflections.Demo;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void meow(){
        System.out.println("Cat says Meow ....");
    }

    private static void thisIsAPrivateAndStaticMethod(){
        System.out.println("Hii, I am a private and static method !!");
    }

    private static void newMethodName(){
        System.out.println("Hii, I am a private and static method !!");
    }
}
