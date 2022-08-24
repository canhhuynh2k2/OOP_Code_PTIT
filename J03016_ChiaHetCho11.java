import java.util.Scanner;
import java.math.BigInteger;
public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            BigInteger s = new BigInteger(in.next());
            BigInteger s2 = new BigInteger("11");
            if(s.compareTo(s.divide(s2).multiply(s2)) == 0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
