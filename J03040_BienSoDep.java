import java.util.*;
public class J03040_BienSoDep {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)){
                System.out.println("YES");
            }
            else if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)){
                System.out.println("YES");
            }
            else if((s.charAt(5) == '6' || s.charAt(5) == '8') && (s.charAt(6) == '6' || s.charAt(6) == '8')
                    && (s.charAt(7) == '6' || s.charAt(7) == '8') && (s.charAt(9) == '6' || s.charAt(9) == '8')
                    && (s.charAt(10) == '6' || s.charAt(10) == '8')){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
