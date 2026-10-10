package Annotations.demo;

public class ExampleDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        Class c = d.getClass();
        System.out.println(c.getName());

        MyAnnotation an = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
        System.out.println(an.id());
        System.out.println(an.name());
    }
}
