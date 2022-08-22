import java.util.*;
public class J03025_XauDoiXung {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int cnt = 0, len = s.length();
            for(int i = 0; i < len/2; i++){
                if(s.charAt(i) != s.charAt(len-i-1)){
                    cnt++;
                }
            }
            if(cnt == 1 && len % 2 == 0){
                System.out.println("YES");
            }
            else if(cnt <= 1 && len % 2 == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
