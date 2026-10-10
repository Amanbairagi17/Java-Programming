package College;

class Student {

    int enrollment;
    String name;
    int date;
    Student(int enrollment, String name){
        this.enrollment = enrollment;
        this.name = name;
    }
    void setDate(int date) {
        this.date = date;
    }
    void getDate() {
        System.out.println(this.enrollment + " : " +this.name+ " : " +this.date );
    }

}
class Batch extends Student{
    int stream;
    String id ;
    Batch(int stream, int enrollment, String name){
        super(enrollment, name);
        this.stream = stream;

    }
    void setId(String id){
        this.id = id;
    }
    void showDetails(){
        System.out.println(enrollment+ ": " +name+ " : " + stream + " : " + id);
    }


}
