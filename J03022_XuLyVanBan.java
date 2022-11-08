import java.util.*;
// @author canhhuynh2k2 
public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        List<String> lst = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?'){
                    lst.add(res);
                    res = "";
                }
                else{
                    res += s.charAt(i);
                }
            }
            if(res.length() > 0) res = res + " ";
        }
        for(String x : lst){
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
            System.out.println(x);
        }
    }
}
