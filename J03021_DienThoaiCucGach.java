import java.util.*;
public class J03021_DienThoaiCucGach {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Character, String> h = new HashMap<Character, String>();
        h.put('a', "2"); h.put('b', "2"); h.put('c', "2");
        h.put('d', "3"); h.put('e', "3"); h.put('f', "3");
        h.put('g', "4"); h.put('h', "4"); h.put('i', "4");
        h.put('j', "5"); h.put('k', "5"); h.put('l', "5");
        h.put('m', "6"); h.put('n', "6"); h.put('o', "6");
        h.put('p', "7"); h.put('q', "7"); h.put('r', "7"); h.put('s', "7");
        h.put('t', "8"); h.put('u', "8"); h.put('v', "8");
        h.put('w', "9"); h.put('x', "9"); h.put('y', "9"); h.put('z', "9");
        int t = in.nextInt();
        while(t-- > 0){
            String s = in.next();
            s = s.toLowerCase();
            String ss = "";
            for(int i = 0; i < s.length(); i++){
                ss = ss + h.get(s.charAt(i));
            }
            if(ss.equals(new StringBuilder(ss).reverse().toString())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
