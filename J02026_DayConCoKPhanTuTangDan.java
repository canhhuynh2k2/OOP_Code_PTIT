// @author canhhuynh2k2
import java.util.*;
public class J02026_DayConCoKPhanTuTangDan {
    static int n = 0, k = 0;
    static ArrayList<Integer> lst = new ArrayList<>();
    static int a[] = new int[20];
    static void Try(int i){
        for(int j = a[i-1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                for(int d = 1; d <= k; d++){
                    System.out.print(lst.get(a[d]-1) + " ");
                }
                System.out.println();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            a[0] = 0;
            lst = new ArrayList<>();
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i = 0; i < n; i++){
                lst.add(sc.nextInt());
            }
            Collections.sort(lst);
            Try(1);
        }
    }
}
