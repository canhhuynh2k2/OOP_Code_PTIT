/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class Thisinh{
    private String ma, ten, nSinh, XLoai;
    private int tuoi, diem;
    public Thisinh(String s1, String s2, float f1, float f2, int c){
        String Ma = String.valueOf(c);
        if(Ma.length() == 1) Ma = "0" + Ma;
        this.ma = "PH" + Ma;
        this.ten = s1;
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        float thuong = 0F;
        if(f1 >= 8F && f2 >= 8F) thuong = 1f;
        else if(f1 >= 7.5f && f2 >= 7.5f) thuong = 0.5f;
        int d = Math.round((f1+f2)/2+thuong);
        if(d > 10) d = 10;
        this.diem = d;
        this.tuoi = 2021 - Integer.parseInt(s2.substring(s2.length() - 4, s2.length()));
        if(this.diem < 5) XLoai = "Truot";
        else if(this.diem == 5 || this.diem == 6) XLoai = "Trung binh";
        else if(this.diem == 7) XLoai = "Kha";
        else if(this.diem == 8) XLoai = "Gioi";
        else XLoai = "Xuat sac";
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public int getTuoi(){
        return this.tuoi;
    }
    public int getDiem(){
        return this.diem;
    }
    public String getXLoai(){
        return this.XLoai;
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int t = in.nextInt();
        ArrayList<Thisinh> l = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ig = in.nextLine();
            l.add(new Thisinh(in.nextLine(),in.nextLine(), in.nextFloat(), in.nextFloat(), i));
        }
        for(Thisinh x : l){
            System.out.printf("%s %s%d %d %s\n", x.getMa(), x.getTen(), x.getTuoi(), x.getDiem(), x.getXLoai());
        }
    }
}
