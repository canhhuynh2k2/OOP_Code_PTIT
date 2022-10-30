/* @author canhhuynh2k2 */
import java.util.*;
public class J08010_TimTuThuanNghichDaiNhat {
    static boolean check(String s){
//        for(int i = 0; i < s.length()/2; i++){
//            if(s.charAt(i) != s.charAt(s.length()-i-1)){
//                return false;
//            }
//        }
//        return true;
        StringBuilder str = new StringBuilder(s);
        String ss = str.reverse().toString();
        return ss.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        int Max = 0;
        while(sc.hasNext()){
            String str = sc.next();
            if(check(str)){
                if(hm.containsKey(str)){
                    hm.put( str, hm.get(str) + 1);
                }
                else{
                    hm.put(str, 1);
                }
                Max = Math.max(Max, str.length());
            }
        }
        for(String x : hm.keySet()){
            if(x.length() == Max){
                System.out.println(x + " " + hm.get(x));
            }
        }
    }
}
