import java.util.Scanner;
import java.math.BigInteger;
public class J03014_TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger s1 = new BigInteger(in.next());
        BigInteger s2 = new BigInteger(in.next());
        System.out.println(s1.add(s2).toString());
    }
}
