/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            int d = in.nextInt();
            List<Integer> ll = new ArrayList<>();
            int a[][] = new int[n+1][m+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    a[i][j] = in.nextInt();
                    if(j == d) ll.add(a[i][j]);
                }
            }
            Collections.sort(ll);
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(j == d){
                        System.out.printf("%d ", ll.get(i-1));
                    }
                    else System.out.printf("%d ", a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
