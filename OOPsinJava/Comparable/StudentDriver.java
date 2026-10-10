package OOPsinJava.Comparable;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(123,"Aman Bairagi",30000,"AIML",21);
        Student s2 = new Student(132,"Tarun Chourey",35000,"AI",22);
        Student s3 = new Student(232,"Harsh",20000,"CS",22);
        Student s4 = new Student(001,"Aayush Rathore",120000,"IT",21);
        Student s5 = new Student(111,"Satyam Gurjar",45000,"CD",24);
        Student[] students = {s1,s2,s3,s4,s5};

        System.out.println("For Id enter 1");
        System.out.println("For Name enter 2");
        System.out.println("For Fees enter 3");
        System.out.println("For Branch enter 4");
        System.out.println("For Age enter 5");
        System.out.println("Enter your Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> Arrays.sort(students, new StudentBasedOnId());
            case 2 -> Arrays.sort(students, new StudentBasedOnName());
            case 3 -> Arrays.sort(students, new StudentBasedOnFees());
            case 4 -> Arrays.sort(students, new StudentBasedOnBranch());
            case 5 -> Arrays.sort(students, new StudentBasedOnAge());
            default -> System.out.println("Invalid Input ..");
        }
        System.out.println(Arrays.toString(students));


//        For Comparable
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
//        System.out.println("After sorting : ");
//        System.out.println(Arrays.toString(students));

    }

}
