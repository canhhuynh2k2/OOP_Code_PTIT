// @author canhhuynh2k2
import java.util.*;
public class J08028_HinhChuNhatDonSac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n+2];
        a[0] = a[n+1] = -1;
        int[] b = new int[n+2];
        b[0] = b[n+1] = -1;
        int R1[] = new int[n+1];
        int L1[] = new int[n+1];
        int R2[] = new int[n+1];
        int L2[] = new int[n+1];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(0); st2.push(0);
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();;
            b[i] = m - a[i];
            while(!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if(st.empty()){
                st.push(0);
            }
            L1[i] = st.peek();
            st.push(i);
            while(!st2.empty() && b[i] <= b[st2.peek()]) st2.pop();
            if(st2.empty()){
                st2.push(0);
            }
            L2[i] = st2.peek();
            st2.push(i);
        }
        st.clear(); st2.clear();
        st.push(n+1);
        st2.push(n+1);
        for(int i = n; i > 0; i--){
            while(!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if(st.empty()) st.push(n+1);
            R1[i] = st.peek();
            st.push(i);
            while(!st2.empty() && b[i] <= b[st2.peek()]) st2.pop();
            if(st.empty()) st2.push(n+1);
            R2[i] = st2.peek();
            st2.push(i);
        }
        
        long ans = 0L;
        for(int i = 1; i <= n; i++){
            ans = Math.max(ans, (long)a[i] * (R1[i] - L1[i] - 1));
            ans = Math.max(ans, (long)b[i] * (R2[i] - L2[i] - 1));
        }
        System.out.println(ans);
    }
}
