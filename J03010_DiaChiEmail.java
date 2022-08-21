import java.util.Scanner;
import java.util.HashMap;
public class J03010_DiaChiEmail {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        String ig = in.nextLine();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        while(t > 0){
            String ss = "";
            String s[] = in.nextLine().toLowerCase().split("\\s");
            int i = s.length - 1;
            for(i = s.length - 1; i >= 0; i--){
                if(s[i].length() > 0){
                    ss = s[i];
                    break;
                }
            }
            for(int j = 0; j < i; j++){
                if(s[j].length() > 0){
                    ss += s[j].charAt(0);
                }
            }
            if(h.containsKey(ss)){
            	h.replace(ss, h.get(ss) + 1);
                System.out.print(ss + h.get(ss));
            }
            else{
            	h.put(ss, 1);
                System.out.print(ss);
            }
            System.out.println("@ptit.edu.vn");
            t--;
        }
    }
}