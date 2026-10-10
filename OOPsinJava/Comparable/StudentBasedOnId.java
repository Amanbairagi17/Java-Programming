package OOPsinJava.Comparable;

import java.util.Comparator;

public class StudentBasedOnId implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s2.id - s1.id;
    }
}
