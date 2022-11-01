// @author canhhuynh2k2
import java.util.*;
public class J08026_BienDoiS_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int S = sc.nextInt();
            int T = sc.nextInt();
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            dq.add(S);
            hm.put(S, 0);
            while(!dq.isEmpty()){
                int d = dq.pop();
                int tmp = hm.get(d);
                if(d == T){
                    System.out.println(hm.get(d));
                    break;
                }
                if(d < T && !hm.containsKey(d * 2)){
                    hm.put(d * 2, tmp + 1);
                    dq.add(d * 2);
                }
                if(d > 0 && !hm.containsKey(d-1)){
                    hm.put(d - 1, tmp + 1);
                    dq.add(d - 1);
                }
               
            }
        }
    }
}
