// @author canhhuynh2k2
import java.util.*;
public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            Map<Character, Integer> hm = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                }
                else{
                    hm.put(s.charAt(i), 1);
                }
            }
            if(26 - hm.size() <= k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
