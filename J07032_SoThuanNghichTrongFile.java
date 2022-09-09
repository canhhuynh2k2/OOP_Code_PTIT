/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
public class J07032_SoThuanNghichTrongFile {
    public static boolean check(int n){
        String s = String.valueOf(n);
        for(int i = 0; i <= s.length()/2; i++){
            if((s.charAt(i) - 48) % 2 == 0) return false;
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        if(s.length() % 2 == 1 && s.length() > 1) return true;
        return false;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l1 = (ArrayList<Integer>) obj1.readObject();
        List<Integer> l2 = (ArrayList<Integer>) obj2.readObject();
        Map<Integer, Integer> s1 = new HashMap<>();
        Map<Integer, Integer> s2 = new HashMap<>();
        for(int x : l1){
            if(check(x)){
                if(!s1.containsKey(x)){
                    s1.put(x, 1);
                }
                else{
                    s1.replace(x, s1.get(x) + 1);
                }
            }
        }
        for(int x : l2){
            if(check(x)){
                if(!s2.containsKey(x)){
                    s2.put(x, 1);
                }
                else{
                    s2.replace(x, s2.get(x) + 1);
                }
            }
        }
        List<Integer> ll = new ArrayList<>(s1.keySet());
        Collections.sort(ll);
        int count = 0;
        for(int x : ll){
            if(s2.containsKey(x)){
                System.out.printf("%d %d\n", x, s1.get(x) + s2.get(x));
                count++;
            }
            if(count == 10) break;
        }
    }
}
