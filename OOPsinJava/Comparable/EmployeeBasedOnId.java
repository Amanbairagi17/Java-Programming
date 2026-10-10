package OOPsinJava.Comparable;

import java.util.Comparator;

public class EmployeeBasedOnId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.id - e2.id;
    }
}
