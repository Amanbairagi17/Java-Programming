package OOPsinJava.Comparable;

import java.util.Comparator;

public class StudentBasedOnFees implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return (int)(s1.fees - s2.fees);
    }
}
