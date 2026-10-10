package OOPsinJava;

import java.security.PublicKey;

public class fraction {
    public static Fraction add(Fraction f1 , Fraction f2 ){
        int numerator =f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;
    }
    //find gcd of both numbers that means hcf that common in both number
    public static int gcd(int num , int den){
        int min = Math.min(num, den);
        for (int i = min ; i>=1 ; i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    public static  class Fraction{
        int num;
        int den;
        public Fraction(int num , int den){
            this.num=num;
            this.den=den;
            simplify();
        }
        // Simplify is simplify our values
        public void simplify(){
            int HCF = gcd(num,den);
            num/=HCF;
            den/=HCF;
        }

    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,9);
        System.out.println(f1.num+"/"+ f1.den);

        Fraction f2 = new Fraction(9,3);
        System.out.println(f2.num+"/"+ f2.den);
        Fraction f3 = add(f1,f2);
        System.out.println(f1+"/"+f2);
    }
}
