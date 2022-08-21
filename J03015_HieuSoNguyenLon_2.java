import java.util.*;
import java.math.BigInteger;
public class J03015_HieuSoNguyenLon_2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String a = in.next();
        String b = in.next();
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        BigInteger ans = s1.subtract(s2);
        System.out.println(ans.toString());
    }
}
