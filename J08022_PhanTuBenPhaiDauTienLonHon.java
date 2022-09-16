/* @author canhhuynh2k2 */
import java.util.*;
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            List<Integer> l = new ArrayList<>();
            ArrayDeque<Integer> ad = new ArrayDeque<>();
            ArrayDeque<Integer> ans = new ArrayDeque<>();
            for(int i = 0; i < n; i++){
                l.add(in.nextInt());
            }
            for(int i = n - 1; i >= 0; i--){
                while(ad.size() > 0 && l.get(i) >= ad.peek()){
                    ad.pop();
                }
                if(ad.size() == 0){
                    ans.push(-1);
                }
                else{
                    ans.push(ad.peek());
                }
                ad.push(l.get(i));
            }
            while(ans.size() > 0){
                System.out.printf("%d ", ans.pop());
            }
            System.out.println();
        }
    }
}
