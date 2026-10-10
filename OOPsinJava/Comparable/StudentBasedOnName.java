package OOPsinJava.Comparable;

import com.sun.jdi.event.StepEvent;

import java.util.Comparator;

public class StudentBasedOnName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s2.name.compareTo(s1.name);
    }
}
