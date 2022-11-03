// @author canhhuynh2k2
import java.util.*;
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            List<Long> lst = new ArrayList<>();
            for(int i = 0; i < n; i++){
                lst.add(sc.nextLong());
            }
            int i = 0;
            while(i < n - 1){
                if(lst.get(i) >= lst.get(i+1)) break;
                i++;
            }
            if(i == n - 1) System.out.println("0");
            else System.out.println(i+1);
        }
    }
}
