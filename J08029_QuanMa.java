package J08029;
// @author canhhuynh2k2
import java.util.*;
public class J08029_QuanMa {
    public static int[] di = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static int[] dj = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 97; i <= 104; i++){
            h.put((char)i, i - 96);
        }
        for(int i = 49; i <= 56; i++){
            h.put((char)i, i - 48);
        }
        int t = sc.nextInt();
        while(t-- > 0){
            String x1 = sc.next();
            String x2 = sc.next();
            ArrayDeque<String> dq = new ArrayDeque<>();
            HashMap<String, Integer > hm = new HashMap<>();
            String k = h.get(x1.charAt(0)) + " " + h.get(x1.charAt(1));
            dq.add(k);
            String y = h.get(x2.charAt(0)) + " " + h.get(x2.charAt(1));
            
            hm.put(k, 0);
            while(!dq.isEmpty()){
                String x = dq.poll();
                if(x.compareTo(y) == 0){
                    System.out.println(hm.get(x));
                    break;
                }
                for(int i = 0; i < 8; i++){
                    int a = (int)(x.charAt(0) - 48) + di[i];
                    int b = (int)(x.charAt(2) - 48) + dj[i];
                    String tmp = a + " " + b;
                    if(a >= 1 && a <= 8 && b > 0 && b <= 8 && !hm.containsKey(tmp)){
                        dq.add(tmp);
                        hm.put(tmp, hm.get(x) + 1);
                    }
                }
            }
        }
    }
}
