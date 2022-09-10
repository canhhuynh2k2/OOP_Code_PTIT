/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class SV implements Comparable<SV>{
    private String ma, ten, XLoai;
    private float diem;
    public SV(int c, String s1, float f1, float f2, float f3){
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        String Ma = String.valueOf(c);
        if(Ma.length() == 1) Ma = "0" + Ma;
        this.ma = "SV" + Ma;
        this.diem = f1*0.25f + f2*0.35f + f3*0.4f;
        if(this.diem >= 8f) this.XLoai = "GIOI";
        else if(this.diem >= 6.5f) this.XLoai = "KHA";
        else if(this.diem >= 5f) this.XLoai = "TRUNG BINH";
        else this.XLoai = "KEM";
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
    public String getXLoai(){
        return this.XLoai;
    }
    @Override
    public int compareTo(SV a){
        if(a.getDiem() > this.diem) return 1;
        return -1;
    }
}
public class J07055_XepLoai {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        List<SV> l = new ArrayList<>();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String ig = in.nextLine();
            l.add(new SV(i+1, in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat()));
        }
        Collections.sort(l);
        for(SV x : l){
            System.out.printf("%s %s%.2f %s\n", x.getMa(), x.getTen(), x.getDiem(), x.getXLoai());
        }
    }
}
