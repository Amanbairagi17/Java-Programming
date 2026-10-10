package SAP;

public class FastModular {
    public static void main(String[] args) {
        int base = 2;
        int exp = 6;
        int mod = 10;

        long result = 1;

//        while (exp > 0) {
//            if ((exp & 1) == 1) {
//                result = (result * base) % mod;
//                exp--;
//            }else {
//                base = (base * base) % mod;
//                exp /= 2;
//            }
//
//        }
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1; // exp /= 2;

        }

        System.out.println(result);
    }
}
