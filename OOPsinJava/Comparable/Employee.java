package OOPsinJava.Comparable;

public  class Employee implements Comparable<Employee>{
    int id;
    String name;
    double price;
    Employee(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + ", price=" + price +"\n";
    }
    @Override
    public int compareTo(Employee o){
//        if (this.id == o.id) return 0;
//        if (this.id > o.id) return 1;
//        else return -1;
        return this.id - o.id;
    }
}
