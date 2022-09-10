/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class VietTat implements Comparable<VietTat>{
    private String ten, ho, hoTen, TenVT;
    public VietTat(String s){
        this.hoTen = s;
        String ss[] = s.split(" ");
        String y = "", x = "";
        this.ten = ss[ss.length-1];
        for(int i = 0; i < ss.length - 1; i++){
            y += ss[i] + " ";
            x += ss[i].substring(0, 1) + ".";
        }
        this.ho = y;
        x += ss[ss.length-1].substring(0, 1);
        this.TenVT = x;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public String getHo(){
        return this.ho;
    }
    public String getTenVT(){
        return this.TenVT;
    }
    public String getTen(){
        return this.ten;
    }
    @Override
    public int compareTo(VietTat a){
        if(this.ten.compareTo(a.getTen()) > 0) return 1;
        else if(this.ten.compareTo(a.getTen()) == 0){
            if(this.ho.compareTo(a.getHo()) > 0) return 1;
        }
        return -1;
    }
}
public class J07071_TenVietTat {
    static boolean check(String a, String b){
        if(a.length() != b.length()) return false;
        int c = 0, d = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '*') d++;
            if(a.charAt(i) != b.charAt(i)) c++;
        }
        if(c == 0 || (c == 1 && d == 1)) return true;
        else return false;
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        List<VietTat> l = new ArrayList<>();
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t-- > 0){
            
            l.add(new VietTat(in.nextLine()));
        }
        int n = in.nextInt();
        ig = in.nextLine();
        while(n-- > 0){
            List<VietTat> ans = new ArrayList<>();
            String s = in.nextLine();
            for(VietTat x : l){
                if(check(s, x.getTenVT())) ans.add(x);
            }
            Collections.sort(ans);
            for(VietTat x : ans){
                System.out.printf("%s\n", x.getHoTen());
            }
        }
        
    }
}
