package Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Driver {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<Employee>();
        set.add(new Employee(1,"a",9000));
        set.add(new Employee(3,"k",8000));
        set.add(new Employee(9,"f",4500));
        set.add(new Employee(11,"a11",300000));
        set.add(new Employee(32,"k344",70000));
        set.add(new Employee(93,"fff",800000));
      //  set.remove(new Employee(1,"a"));
        System.out.println(set);

    }
}
