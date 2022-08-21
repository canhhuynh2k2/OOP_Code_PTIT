import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
public class J03009_TapTuRiengCuaHaiXau {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t > 0){
            HashMap<String, Integer> h = new HashMap<String, Integer>();
            ArrayList<String> arr = new ArrayList<String>();
            String s1[] = in.nextLine().split(" ");
            String s2[] = in.nextLine().split(" ");
            for(int i = 0; i < s2.length; i++){
                h.put(s2[i], 1);
            }
            for(int i = 0; i < s1.length; i++){
                if(!h.containsKey(s1[i])){
                    arr.add(s1[i]);
                    h.put(s1[i], 1);
                }
            }
            Collections.sort(arr);
            for(String ss : arr){
                System.out.print(ss + " ");
            }
            System.out.println();
            t--;
        }
    }
}
