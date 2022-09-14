/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
public class J07079_GiaTriNhiPhan {
    static long convert(String s){
        long ans = 0L;
        int j = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1') ans += Math.pow(2, j);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> l = (ArrayList<String>)obj.readObject();
        for(String x : l){
            String s = "";
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) == '1' || x.charAt(i) == '0') s = s + x.charAt(i);
            }
            System.out.printf("%s %d\n", s, convert(s));
        }
    }
}
