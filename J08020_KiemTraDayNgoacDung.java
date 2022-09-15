/* @author canhhuynh2k2 */
import java.util.*;
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int ok = 1;
            ArrayDeque<Character> ad = new ArrayDeque<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') ad.push(s.charAt(i));
                else{
                    if(ad.size() == 0){
                        ok = 0;
                        break;
                    }
                    else{
                        if(ad.peek() == '{' && s.charAt(i) == '}') ad.pop();
                        else if(ad.peek() == '[' && s.charAt(i) == ']') ad.pop();
                        else if(ad.peek() == '(' && s.charAt(i) == ')') ad.pop();
                        else{
                            ok = 0;
                            break;
                        }
                    }
                }
            }
            if(ok == 1 && ad.size() == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
