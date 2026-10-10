package OOPsinJava;

import java.util.Scanner;
// Class and Object Concept Basics of java


class Computer{
    public void playMusic(){
        System.out.println("Playing Music...");
    }
    public String getMeAPen(int cost){
        if (cost>=10)
            return "Your Pen";
        return "Nothing";
    }

}

class Calculator{
    //Method Overloading
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, int b){
        return a+b;
    }
}
public class Demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        Computer c1 = new Computer();// Computer is a class and c1 is a object of this clas
//        c1.playMusic();//c1 is a reference variable that help to called method pf computer class
//        String s=c1.getMeAPen(c);
//        System.out.println(s);
        Calculator op1 = new Calculator();
        int r1=op1.add(2,3);
        r1= op1.add(4,51,1);
        double r2=op1.add(2.0,4);
        System.out.println(r1);
        System.out.println(r2);
    }
}
