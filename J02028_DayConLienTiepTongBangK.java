// @author canhhuynh2k2
import java.util.*;
public class J02028_DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            ArrayList<Integer> lst = new ArrayList<>();
            for(int i = 0; i < n; i++){
                lst.add(sc.nextInt());
            }
            int i = 0, j = 0;
            long ans = lst.get(0);
            int ok = 0;
            while(i < n && j < n){
                if(ans == k && i <= j){
                    ok = 1;
                    break;
                }
                else if(ans < k){
                    j++;
                    if(j == n) break;
                    ans += lst.get(j);
                }
                else{
                    ans -= lst.get(i);
                    i++;
                }
            }
            if(ok == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
