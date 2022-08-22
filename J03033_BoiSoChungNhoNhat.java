import java.util.*;
import java.math.BigInteger;
public class J03033_BoiSoChungNhoNhat {
    static Scanner in = new Scanner(System.in);
    static BigInteger USCLN(BigInteger a, BigInteger b){
        BigInteger zero = new BigInteger("0");
        while(b.compareTo(zero) > 0){
            BigInteger c = a.subtract(a.divide(b).multiply(b));
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            String s1 = in.next();
            String s2 = in.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.multiply(b).divide(USCLN(a, b)));
        }
    }
}
