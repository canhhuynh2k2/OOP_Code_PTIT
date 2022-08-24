import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
public class J07008_DayConTangDan {
    static int[] a = new int[25];
    static int n;
    static ArrayList<String> arr = new ArrayList<String>();
    static ArrayList<String> ans = new ArrayList<String>();
    static void solve(){
        int tmp = -1, ok = 0;
        String res = "";
        for(int i = 1; i <= n; i++){
            if(a[i] == 1){
                if(Integer.parseInt(arr.get(i-1)) <= tmp){
                    ok = 0;
                    break;
                }
                else{
                    tmp = Integer.parseInt(arr.get(i-1));
                    res += arr.get(i-1) + " ";
                    ok++;
                }
            }
        }
        if(ok >= 2) ans.add(res);
    }
    static void Try(int i){
        for(int j = 0; j <= 1; j++){
            a[i] = j;
            if(i == n){
                solve();
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        File f = new File("DAYSO.in");
        Scanner in = new Scanner(f);
        n = Integer.parseInt(in.nextLine());
        String data = in.nextLine();
        data += "#";
        String x = "";
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) <= '9' && data.charAt(i) >= '0'){
                x += data.charAt(i);
            }
            else{
                if(x.compareTo("") != 0) arr.add(x);
                x = "";
            }
        }
        Try(1);
        Collections.sort(ans);
        for(String s : ans){
            System.out.println(s);
        }
    }
}
