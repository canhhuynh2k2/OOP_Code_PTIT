/* @author canhhuynh2k2 */
import java.util.*;
public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s1 = in.next();
            String s2 = in.next();
            if(s1.compareTo(s2) == 0) System.out.println("-1");
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
