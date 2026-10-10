package CollectionFramework;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(3,2);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.addElement(9);
        v1.addElement(87);
        v1.addElement(84);
        v1.addElement(900);
        System.out.println(v1.capacity());
        v1.addElement(90);
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());

        for (int i : v1){
            System.out.println(i);
        }
    }
}
