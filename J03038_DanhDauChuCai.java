import java.util.*;
public class J03038_DanhDauChuCai {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String s = in.next();
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), 1);
            }
        }
        System.out.println(h.size());
    }
}
