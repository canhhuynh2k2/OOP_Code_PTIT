import java.util.*;
import java.math.BigInteger;
public class J03013_HieuSoNguyenLon_1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t > 0){
            String a = in.next();
            String b = in.next();
            BigInteger s1 = new BigInteger(a);
            BigInteger s2 = new BigInteger(b);
            BigInteger c = s1.subtract(s2).abs();
            StringBuilder str = new StringBuilder(c.toString());
            int MaxLen = Math.max(a.length(), b.length());
            while(str.length() < MaxLen) str.insert(0, '0');
            System.out.println(str);
            t--;
        }
    }
}
