/* @author canhhuynh2k2 */
import java.util.*;
public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            l.add(in.nextInt());
        }
        int i = 0;
        while(i < l.size() - 1){
            if((l.get(i) + l.get(i+1)) % 2 == 0){
                l.remove(i);
                l.remove(i);
                if(i > 0) i--;
                continue;
            }
            i++;
        }
        System.out.println(l.size());
    }
}
