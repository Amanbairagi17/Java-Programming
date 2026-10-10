package OOPsinJava;
class Students{
    int rollno;
    String name;
    int marks;
    //constructor
    Students(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
public class ArrayObject {
    public static void main(String[] args) {
        Students s1 = new Students(1,"Aman",99);
        Students s2 = new Students(2,"Rohit",88);
        Students s3 = new Students(55,"Surendra",90);


        Students students[] = new Students[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i=0;i<students.length;i++){
            System.out.println(students[i].rollno+ " : " +students[i].name+ " : "  + students[i].marks);
        }
    }
}
