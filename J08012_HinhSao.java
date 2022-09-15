/* @author canhhuynh2k2 */
import java.util.*;
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int u = 0, v = 0, ok = 0;
        int a[] = new int[n+1];
        for(int i = 0; i < n - 1; i++){
            u = in.nextInt();
            v = in.nextInt();
            a[u]++;
            a[v]++;
            if(a[u] == n - 1 || a[v] == n - 1) ok = 1;
        }
        if(ok == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
