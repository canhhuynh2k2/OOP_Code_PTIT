/* @author canhhuynh2k2 */
import java.util.*;
public class J02016_BoBaSoPytago {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            List<Long> list = new ArrayList<>();
            HashMap<Long, Integer> mp = new HashMap<>();
            int n = in.nextInt(), ok = 0;
            for(int i = 0; i < n; i++){
                long x = in.nextLong();
                list.add(x * x);
                if(mp.containsKey(x * x)){
                    mp.replace(x * x, mp.get(x * x) + 1);
                }
                else{
                    mp.put(x * x, 1);
                }
            }
            Collections.sort(list);
            for(int i = 0; i < n - 2; i++){
                for(int j = i + 1; j < n - 1; j++){
                    if(mp.containsKey(list.get(i) + list.get(j))){
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
