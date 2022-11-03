// @author canhhuynh2k2
import java.util.*;
public class J02024_DayConCoTongLe {
    static ArrayList<Integer> a = new ArrayList<>();
    static int b[] = new int[20];
    static int n = 0;
    static void solve(){
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(b[i] == 1){
                ans += a.get(i);
            }
        }
        if(ans % 2 == 1){
            for(int i = n - 1; i >= 0; i--){
                if(b[i] == 1) System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }
    static void Try(int i){
        for(int j = 0; j <= 1; j++){
            b[i] = j;
            if(i == 0){
                solve();
            }
            else Try(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            a = new ArrayList<>();
            for(int i = 0; i < n; i++){
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            Try(n-1);
        }
    }
}
