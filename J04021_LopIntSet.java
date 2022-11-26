// @author canhhuynh2k2
import java.util.*;
class IntSet{
    private int[] a;
    public IntSet(int a[]){
        this.a = a;
    }
    public IntSet union(IntSet b){
        Set<Integer> st = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            st.add(a[i]);
        }
        for(int i = 0; i < b.getA().length; i++){
            st.add(b.getA()[i]);
        }
        int i = 0;
        int[] c = new int[st.size()];
        for(int x : st){
            c[i] = x;
            i++;
        }
        return new IntSet(c);
    }
    public int[] getA(){
        return a;
    }
    public String toString(){
        String ans = "";
        for(int i = 0; i < a.length; i++){
            ans += a[i] + " ";
        }
        return ans;
    }
}
public class J04021_LopIntSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
