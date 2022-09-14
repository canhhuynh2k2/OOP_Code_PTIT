/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
public class J07085_TongChuSo {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> l = (ArrayList<String>) obj.readObject();
        for(String x : l){
            String ss = "";
            int sum = 0;
            for(int i = 0; i < x.length(); i++){
                if(Character.isDigit(x.charAt(i))){
                    ss = ss + x.charAt(i);
                    sum += x.charAt(i) - 48;
                }
            }
            while(ss.length() > 0 && ss.charAt(0) == '0') ss = ss.substring(1);
            System.out.printf("%s %d\n", ss, sum);
        }
    }
}
