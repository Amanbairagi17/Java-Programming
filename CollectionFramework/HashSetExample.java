package CollectionFramework;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();//Not allows duplicates , Not maintain insertion order
//        set.add(2);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//        set.add(23);
//        set.add(90);
//
//        System.out.println(set.isEmpty()); //true
//        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);//here set remove() remove specific element
//        System.out.println(set.contains(3));// true
//        System.out.println(set.size());//2
//        System.out.println(set.isEmpty());//false

//        Iterator<Integer> itr = set.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        HashSet<Integer> set = new LinkedHashSet<>();//Maintain insertion order
//        set.add(2);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//        set.add(23);
//        set.add(90);
//
//        System.out.println(set.isEmpty()); //true
//        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);//here set remove() remove specific element
//        System.out.println(set.contains(3));// true
//        System.out.println(set.size());//2
//        System.out.println(set.isEmpty());//false

        TreeSet<Integer> set = new TreeSet<>();//Maintain insertion order Naturally {2,3,6,8,17}
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(23);
        set.add(90);

        System.out.println(set.isEmpty()); //true
        System.out.println(set); //[2, 3, 4, 23, 90]
        set.remove(2);
        System.out.println(set);//here set remove() remove specific element
        System.out.println(set.contains(3));// true
        System.out.println(set.size());//2
        System.out.println(set.isEmpty());//false

    }
}
