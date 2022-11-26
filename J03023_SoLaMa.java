// @author canhhuynh2k2
import java.util.*;
public class J03023_SoLaMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        while(t-- > 0){
            int ans = 0;
            String s = sc.next();
            int i = 0;
            while(i < s.length()){
                if(i < s.length() - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))){
                    ans += hm.get(s.charAt(i+1)) - hm.get(s.charAt(i));
                    i += 2;
                }
                else{
                    ans += hm.get(s.charAt(i));
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
