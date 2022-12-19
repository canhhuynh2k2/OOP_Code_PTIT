// @author canhhuynh2k2
import java.util.*;
public class J03029_ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lst = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            String res = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    if(res.length() > 0 && res.charAt(res.length()-1) != ' '){
                        res += " ";
                    }
                }
                else if(s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?'){
                    if(res.length() > 0 && res.charAt(res.length()-1) != ' '){
                        res += s.charAt(i);
                        res = res.substring(0, 1).toUpperCase() + res.substring(1);
                        lst.add(res);
                        res = "";
                    }
                    if(res.length() > 0 && res.charAt(res.length()-1) == ' '){
                        res = res.substring(0, res.length()-1) + s.charAt(i);
                        res = res.substring(0, 1).toUpperCase() + res.substring(1);
                        lst.add(res);
                        res = "";
                    }
                }
                else{
                    res += s.charAt(i);
                }
            }
            
            if(res.length() > 0){
                if(res.charAt(res.length()-1) == ' ') res = res.substring(0, res.length()-1) + ".";
                else res += ".";
                res = res.substring(0, 1).toUpperCase() + res.substring(1);
                lst.add(res);
            }
        }
        for(String x : lst){
            System.out.println(x);
        }
    }
}
