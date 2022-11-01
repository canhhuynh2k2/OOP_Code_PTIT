// @author canhhuynh2k2
import java.util.*;
public class J08023_HinhChuNhatLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n+2];
            a[0] = -1L; a[n+1] = -1L;
            int L[] = new int[n+1];
            int R[] = new int[n+1];
            Stack<Integer> st1 = new Stack<>();
            Stack<Integer> st2 = new Stack<>();
            st1.push(0);
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
                while(!st1.empty() && a[st1.peek()] >= a[i]) st1.pop();
                if(st1.empty()){
                    st1.push(0);
                }
                L[i] = st1.peek();
                st1.push(i);
            }
            st2.push(n+1);
            for(int i = n; i > 0; i--){
                while(!st2.empty() && a[st2.peek()] >= a[i]) st2.pop();
                if(st2.empty()){
                    st2.push(n+1);
                }
                R[i] = st2.peek();
                st2.push(i);
            }
            long ans = 0;
            for(int i = 1; i <= n; i++){
                ans = Math.max(ans, a[i] * (R[i] - L[i] - 1));
            }
            System.out.println(ans);
        }
    }
}
