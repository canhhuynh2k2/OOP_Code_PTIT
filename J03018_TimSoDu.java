// author canhhuynh2k2
import java.util.*;
public class J03018_TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int tmp = 0;
            if(s.length()  == 1){
                tmp = Integer.parseInt(s);
            }
            else{
                tmp = Integer.parseInt(s.substring(s.length()-2, s.length()));
            }
            if(tmp % 4 == 0){
                System.out.println("4");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
