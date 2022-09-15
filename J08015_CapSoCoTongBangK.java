/* @author canhhuynh2k2 */
import java.util.*;
public class J08015_CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt(), k = in.nextInt(), x = 0;
            long cnt = 0;
            List<Integer> l = new ArrayList<Integer>();
            Map<Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++){
                x = in.nextInt();
                l.add(x);
                if(mp.containsKey(x)) mp.replace(x, mp.get(x) + 1);
                else{
                    mp.put(x, 1);
                }
            }
            for(int i = 0; i < l.size(); i++){
                if(mp.containsKey(k - l.get(i)) && mp.get(k - l.get(i)) > 0){
                    cnt += mp.get(k - l.get(i));
                    if(l.get(i) == k - l.get(i)) cnt--;
                }
                mp.replace(l.get(i), mp.get(l.get(i)) - 1);
            }
            System.out.println(cnt);
        }
    }
}
