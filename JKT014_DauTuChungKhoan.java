/* @author canhhuynh2k2 */
import java.util.*;
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayDeque<Integer> ad = new ArrayDeque<>();
            for(int i = 0; i < n; i++){
                list.add(in.nextInt());
            }
            for(int i = 0; i < n; i++){
                while(ad.size() > 0 && list.get(i) >= list.get(ad.peek())){
                    ad.pop();
                }
                if(ad.size() == 0){
                    System.out.printf("%d ", i + 1);
                }
                else{
                    System.out.printf("%d ", i - ad.peek());
                }
                ad.push(i);
            }
            System.out.println();
        }
    }
}
