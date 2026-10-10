package OOPsinJava.Comparable;

public class Student implements Comparable<Student>{
    int id; // descending order
    String name; // Z-A
    double fees;//descending
    String branch;//alphabetical
    int age;//ascending

    Student(int id, String name, double fees, String branch, int age){
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.branch = branch;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Id : " +id+ " name : " +name+ "  fees : " +fees+ " branch : " +branch+ " age : "+age+"\n ";
    }
    @Override
    public int compareTo(Student o){// Age at ascending order
        if (this.age == o.age) return 0;
        if(this.age > o.age) return 1;
        else return -1;
    }
//    @Override
//    public int compareTo(Student o){// Alphabetical A-Z
//        return this.branch.compareTo(o.branch);
//    }
//    @Override
//    public int compareTo(Student o){ // Ont basis of fees high to low
//        if(this.fees == o.fees) return 0;
//        if(this.fees > o.fees) return -1;
//        else return 1;
//    }

//    @Override
//    public int compareTo(Student o){ // Name Z-A
//        return o.name.compareTo(this.name);
//    }

//    @Override
//    public int compareTo(Student o){// Descending Order Id
//        if(this.id == o.id) return 0;
//        if(this.id > o.id) return -1;
//        else return 1;
//    }


}
