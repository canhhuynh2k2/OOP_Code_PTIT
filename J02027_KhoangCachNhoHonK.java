// @author canhhuynh2k2
import java.util.*;
public class J02027_KhoangCachNhoHonK {
    static List<Integer> lst = new ArrayList<>();
    static int binS(int l, int r, int x){
        if(l > r) return l;
        int m = (l + r) / 2;
        if(lst.get(m) < x) return binS(m + 1, r, x); 
        else return binS(l, m - 1, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            lst = new ArrayList<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = 0; i < n; i++){
                lst.add(sc.nextInt());
            }
            Collections.sort(lst);
            long ans = 0L;
            for(int i = 0; i < lst.size(); i++){
                int index = binS(i + 1, n - 1, k + lst.get(i));
                ans += index - i - 1;
            }
            System.out.println(ans);
        }
    }
}
