// @author canhhuynh2k2
import java.util.*;
public class J02023_LuaChonThamLam {
    static String Max(int n, int s){
        if(s == 0) return "-1";
        String ans = "";
        for(int i = 0; i < n; i++){
            if(s >= 9){
                ans += "9";
                s -= 9;
            }
            else{
                ans += s;
                s = 0;
            }
        }
        if(s > 0) return "-1";
        return ans;
    }
    static String Min(int n, int s){
        if(s == 0) return "-1";
        String ans = "";
        while(s >= 10){
            ans += "9";
            s -= 9;
        }
        if(ans.length() >= n) return "-1";
        if(ans.length() == n - 1) return s + ans;
        if(s > 1){
            ans = String.format("%d", s - 1) + ans;
        }
        while(ans.length() < n - 1) ans = "0" + ans;
        return "1" + ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(Min(n, s) + " " + Max(n, s));
    }
}
