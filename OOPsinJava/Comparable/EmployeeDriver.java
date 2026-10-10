package OOPsinJava.Comparable;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(100,"A",1200);
        Employee e2 = new Employee(101,"T",1500);
        Employee e3 = new Employee(60,"S",500);
        Employee e4 = new Employee(120,"H",1300);
        Employee e5 = new Employee(150,"K",1100);

        Employee[] employees = {e1,e2,e3,e4,e5};

        System.out.println("Press 1 for sorting based on Id ");
        System.out.println("Press 2 for sorting based on Name ");
        System.out.println("Press 3 for sorting based on Salary ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                Arrays.sort(employees, new EmployeeBasedOnId());
                break;
            case 2:
                Arrays.sort(employees, new EmployeeBasedOnName());
                break;
            case 3:
                Arrays.sort(employees, new EmployeeBasedOnSalary());
                break;
            default:
                System.out.println("Invalid input ...");
        }
        System.out.println(Arrays.toString(employees));


//      It's for Comparable
//        System.out.println(Arrays.toString(employees));
//
//        Arrays.sort(employees);
//        System.out.println("After Sorting : ");
//        System.out.println(Arrays.toString(employees));
    }
}
