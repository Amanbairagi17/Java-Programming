package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public int compareTo(Student that) {
        if (this.age > that.age) return 1;
        else if (this.age < that.age) return -1;
        return 0;
    }
}
//class Student{
//    int age;
//    String name;
//    public Student(int age, String name) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString() {
//        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
//    }
//}
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) return 1;
                else if (s1.age < s2.age) return -1;
                else return 0;
            }
        };
        List<Student> student = new ArrayList<>();
        student.add(new Student(12,"Laddu"));
        student.add(new Student(18,"Khushi"));
        student.add((new Student(13,"Krishna")));
        student.add(new Student(21,"Aman"));

        Collections.sort(student);
        for (Student s : student){
            System.out.println(s);
        }
    }
}
