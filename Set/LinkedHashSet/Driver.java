package Set.LinkedHashSet;
import Set.HashSet.Employee;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        LinkedHashSet<Employee> set = new LinkedHashSet<>();
        set.add(new Employee(1,"a",9000));
        set.add(new Employee(93,"fff",800000));
        set.add(new Employee(3,"k",8000));
        set.add(new Employee(11,"a11",300000));
        set.add(new Employee(32,"k344",70000));
        set.add(new Employee(9,"f",4500));

        ArrayList<Employee> E = new ArrayList<>(set);

        System.out.println("Sort According to your choice");
        System.out.println("Enter for sorting BasedOnId");
        System.out.println("Enter for sorting BasedOnName");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> Collections.sort(E , new BasedOnId());
            case 2 -> Collections.sort(E, new BasedOnName());
        }
        Collections.sort(E, new BasedOnId());
        System.out.println(E);

      //  System.out.println(set);

    }
}
