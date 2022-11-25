// @author canhhuynh2k2
package J02102_MaTranXoanOcTangDan;
import java.util.*;
public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int x = sc.nextInt();
                lst.add(x);
            }
        }
        Collections.sort(lst);
        int index = 0, k = 0;
        while(index < n * n){
            for(int i = k; i < n - k; i++){
                a[k][i] = lst.get(index);
                index++;
            }
            for(int i = k + 1; i < n - k; i++){
                a[i][n-k-1] = lst.get(index);
                index++;
            }
            for(int i = n - k - 2; i >= k; i--){
                a[n-k-1][i] = lst.get(index);
                index++;
            }
            for(int i = n - k - 2; i > k; i--){
                a[i][k] = lst.get(index);
                index++;
            }
            k++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
