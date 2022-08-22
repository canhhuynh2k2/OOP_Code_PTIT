import java.util.*;
public class J03027_RutGonXauKyTu {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String s = in.next();
        while(true){
            int ok = 0;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0, i) + s.substring(i+2, s.length());
                    ok = 1;
                    break;
                }
            }
            if(ok == 0) break;
        }
        if(s.length() == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
