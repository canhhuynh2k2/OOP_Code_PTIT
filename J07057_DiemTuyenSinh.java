/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class TS implements Comparable<TS>{
    private String ma, ten, Kqua;
    private float diem;
    public TS(int c, String s1, float d, String s2, int k){
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        String Ma = String.valueOf(c);
        if(Ma.length() == 1) Ma = "0" + Ma;
        this.ma = "TS" + Ma;
        this.diem = d;
        if(s2.compareTo("Kinh") != 0) this.diem += 1.5f;
        if(k == 1) this.diem += 1.5f;
        else if(k == 2) this.diem += 1f;
        if(this.diem >= 20.5f) this.Kqua = "Do";
        else this.Kqua = "Truot";
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public float getDiem(){
        return this.diem;
    }
    public String getKqua(){
        return this.Kqua;
    }
    @Override
    public int compareTo(TS a){
        if(a.getDiem() > this.diem) return 1;
        else if(a.getDiem() == this.diem){
            return this.ma.compareTo(a.getMa());
        }
        return -1;
    }
}
public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("THISINH.in"));
        List<TS> l = new ArrayList<>();
        int t = in.nextInt();
        for(int i = 1; i <= t; i++){
            String ig = in.nextLine();
            String name = in.nextLine();
            float d = in.nextFloat();
            ig = in.nextLine();
            l.add(new TS(i, name, d, in.nextLine(), in.nextInt()));
        }
        Collections.sort(l);
        for(TS x : l){
            System.out.printf("%s %s%.1f %s\n", x.getMa(), x.getTen(), x.getDiem(), x.getKqua());
        }
    }
}
