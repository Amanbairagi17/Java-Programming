package OOPsinJava.Comparable;

import java.util.Comparator;

public class EmployeeBasedOnSalary implements Comparator<Employee> {
    @Override
    public  int compare(Employee e1, Employee e2){
        return (int) (e1.price - e2.price);
    }
}
