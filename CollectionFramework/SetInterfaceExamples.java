package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExamples {
    public static void Hashset(){

    }
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.add(3);
        set.add(1);
        set.add(23);
        set.add(33);
        System.out.println(set);
        set.remove(3);
        System.out.println(set.contains(3));
        System.out.println(set.size());
    }
}
