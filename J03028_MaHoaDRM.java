// @author canhhuynh2k2
import java.util.*;
public class J03028_MaHoaDRM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(t-- > 0){
            String s = sc.next();
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            int res1 = 0, res2 = 0;
            for(int i = 0; i < s1.length(); i++){
                res1 += P.indexOf(s1.charAt(i));
                res2 += P.indexOf(s2.charAt(i));
            }
            String s3 = "", s4 = "", ans = "";
            for(int i = 0; i < s1.length(); i++){
                s3 += P.charAt((P.indexOf(s1.charAt(i)) + res1) % 26);
                s4 += P.charAt((P.indexOf(s2.charAt(i)) + res2) % 26);
            }
            for(int i = 0; i < s3.length(); i++){
                ans += P.charAt((P.indexOf(s3.charAt(i)) + P.indexOf(s4.charAt(i))) % 26);
            }
            System.out.println(ans);
        }
    }
}
