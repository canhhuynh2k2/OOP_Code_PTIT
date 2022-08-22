import java.util.*;
import java.math.BigInteger;
public class J03039_ChiaHet {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            if(a.compareTo(b) < 0){
                BigInteger c = new BigInteger(a.toString());
                a = b;
                b = c;
            }
            if(a.subtract(a.divide(b).multiply(b)).compareTo(new BigInteger("0")) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
