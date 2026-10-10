package OOPsinJava.Annotations;
class A1 {
    public void show() {
        System.out.println("Inside Aa constructor");
    }
}

class B extends A1 {
    @Override
    public void show() {
        System.out.println("Inside Class B");
    }
}

class Example {

    public static void main(String[] args) {
        A1 obj = new B();
        obj.show();

    }
}
