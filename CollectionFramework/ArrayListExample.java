package CollectionFramework;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        Collection nums = new ArrayList();
//        nums.add(3);
//        nums.add(4);
//        nums.add(12);
//        nums.add(34);
//        nums.add(2);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());//0
        System.out.println(nums.isEmpty());//true
        nums.add(3);
        nums.add(4);
        nums.add(12);
        nums.add(34);
        nums.add(2);

        System.out.println(nums);

//        for (int i=0 ; i< nums.size() ; i++){ //Iteration for accessing single element for loop
//            System.out.println(nums.get(i)); // get index
//        }
        for (int num : nums) System.out.println(num);//Iteration for accessing single element for-each loop

        nums.add(3,15); //add at index , value
        System.out.println(nums);
        nums.set(3,3);
        System.out.println(nums);// set value on ith index before [3, 4, 12, 15, 34, 2] after setting index [3, 4, 12, 3, 34, 2]
        nums.remove(3); // remove value 3 from list
        System.out.println(nums);//[3, 4, 12, 34, 2]
        System.out.println(nums.size());//5
        System.out.println(nums.isEmpty()) ; // false
        System.out.println(nums.contains(3)); // check for value 3 are contains in list of not o/p - true

        nums.clear(); // remove all element from list at once
        System.out.println(nums);// empty list
        System.out.println(nums.isEmpty()); // true

        ArrayList<String> arrString = new ArrayList<>(3);
        arrString.add("one");
        arrString.add("two");
        arrString.add("three");
        Iterator<String> itr = arrString.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("String list " +arrString);

        List<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(0);
        System.out.println(list);


//        Integer[] ia = new Integer[list.size()];
//        ia = (Integer[]) list.toArray();
//        for (Object i : ia){
//            System.out.println(i);
//        }



    }
}
