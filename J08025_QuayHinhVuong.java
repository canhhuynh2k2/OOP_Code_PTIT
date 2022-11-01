package J08025;
// @author canhhuynh2k2
import java.util.*;
public class J08025_QuayHinhVuong {
    public static int L[] = {3, 0, 2, 4, 1, 5};
    public static int R[] = {0, 4, 1, 3, 5, 2};
    public static int ans = 0, ok = 0;
    public static String tLeft(String s){
        String res = "";
        for(int i = 0; i < 6; i++){
            res += s.charAt(L[i]);
        }
        return res;
    }
    public static String tRight(String s){
        String res = "";
        for(int i = 0; i < 6; i++){
            res += s.charAt(R[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s1 = "", s2 = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for(int i = 0; i < 6; i++){
                s1 += sc.next();
            }
            for(int i = 0; i < 6; i++){
                s2 += sc.next();
            }
            ArrayDeque<String> dq = new ArrayDeque<>();
            dq.add(s1);
            hm.put(s1, 0);
            while(!dq.isEmpty()){
                String s = dq.pop();
                if(s.compareTo(s2) == 0){
                    System.out.println(hm.get(s));
                    break;
                }
                String tmp1 = tLeft(s);
                hm.put(tmp1, hm.get(s) + 1);
                dq.add(tmp1);
                tmp1 = tRight(s);
                hm.put(tmp1, hm.get(s) + 1);
                dq.add(tmp1);
            }
        }
    }
}

