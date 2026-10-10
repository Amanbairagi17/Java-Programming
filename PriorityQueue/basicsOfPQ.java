package PriorityQueue;

import java.util.*;

public class basicsOfPQ {
    private static class Student{
        String name;
        Integer rollNo;
        String dob;
        Integer marks;
    }
    private static  class StudentComparator implements Comparator<Student>{
        //@Override
        public int compare(Student s1, Student s2) {
            if(s1.marks > s2.marks) return -1;
            else if(s1.marks<s2.marks) return 1;
            else{
                if(s1.rollNo>s2.rollNo) return 1;
                else if(s1.rollNo<s2.rollNo) return -1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) {
       
        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());
        Student s1 = new Student();
        s1.name="Aman Bairagi";
        s1.dob="17-06-2004";
        s1.rollNo =5;
        s1.marks=90;

        Student s2 = new Student();
        s2.name="Kanha";
        s2.dob="18-03-2005";
        s2.rollNo=25;
        s2.marks=90;
        students.add(s1);
        students.add(s2);
        System.out.println(students.peek().name);
        System.out.println(students.peek().dob);
        System.out.println(students.peek().rollNo);
        System.out.println(students.peek().marks);
//       PriorityQueue<Integer> pq = new PriorityQueue<>();//min-heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//max-heap
//        pq.add(10);
//        pq.add(3);
//        pq.add(45);
//        System.out.println(pq);//[3,10,45]
//        pq.add(15);
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
//        pq.add(45);
//        pq.add(34);
//        System.out.println(pq);

    }
}
