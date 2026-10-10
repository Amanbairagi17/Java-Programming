package OOPsinJava;

public class Student {
        String name ;
        int rno;
        double percentage;
        final String schoolName = "DPS";//can not change final value of this variable name
        private static int numberOfStudent;

    public Student(){//default constructor

        }
    public Student(String name , int rno , double percentage) {
        this.name=name;
        this.rno=rno;
        this.percentage=percentage;
        numberOfStudent++;
    }
    public static int getNumberOfStudent(){
        return numberOfStudent;
    }
        public int getRno( ){ //getter fun for accessing the values
            return rno;
        }
        public void setRno(int rno){// setter
            this.rno = rno;
        }

}
