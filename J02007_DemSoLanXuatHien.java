import java.util.Scanner;
import java.util.HashMap;
public class J02007_DemSoLanXuatHien {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int t = in.nextInt();
        for(int test = 1; test <= t; test++){
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
                if(h.containsKey(a[i])) h.replace(a[i], h.get(a[i]) + 1);
                else{
                    h.put(a[i], 1);
                }
            }
            System.out.println("Test " + test + ":");
            for(int i = 0; i < n; i++){
                if(h.get(a[i]) != 0){
                    System.out.println(a[i] + " xuat hien " + h.get(a[i]) + " lan");
                    h.replace(a[i], 0);
                }
            }
        }
    }
}
