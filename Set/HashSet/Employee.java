package Set.HashSet;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    int salary;
    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' +"\n";
    }

    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.id == e.id &&
               this.name.equals(e.name) &&
               this.salary == e.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public int compareTo(Employee o){
        return this.id -o.id;
    }

}
