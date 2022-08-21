import java.util.*;
public class J03024_SoUuThe {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            int cnt = 0, ok = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    ok = 0;
                    break;
                }
                if((s.charAt(i) - 48) % 2 == 0) cnt++;
            }
            if(ok == 0){
                System.out.println("INVALID");
                continue;
            }
            if(s.length() % 2 == 0 && cnt > s.length() - cnt){
                System.out.println("YES");
            }
            else if(s.length() % 2 == 1 && cnt < s.length() - cnt){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
