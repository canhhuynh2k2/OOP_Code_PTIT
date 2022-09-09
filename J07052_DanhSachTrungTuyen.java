/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class ThiSinh implements Comparable<ThiSinh>{
    private String Ma, ten, DUuTien, DXetTuyen;
    private float DToan, DLy, DHoa;
    public ThiSinh(String s1, String s2, float d1, float d2, float d3){
        this.Ma = s1;
        String s[] = s2.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        this.DToan = d1;
        this.DLy = d2;
        this.DHoa = d3;
        if(this.Ma.substring(0, 3).equals("KV1")) this.DUuTien = "0.5";
        else if(this.Ma.substring(0, 3).equals("KV2")) this.DUuTien = "1";
        else{
            this.DUuTien = "2.5";
        }
        float x = d1 * 2 + d2 + d3 + Float.parseFloat(this.DUuTien);
        String tmp = String.valueOf(x);
        int index = tmp.indexOf('.');
        if(tmp.charAt(index+1) == '0') this.DXetTuyen = tmp.substring(0, index);
        else this.DXetTuyen = tmp;
    }
    public String getMa(){
        return this.Ma;
    }
    public String getTen(){
        return this.ten;
    }
    public String getDXetTuyen(){
        return this.DXetTuyen;
    }
    public String getDUuTien(){
        return this.DUuTien;
    }
    @Override
    public int compareTo(ThiSinh b){
        if(Float.parseFloat(this.DXetTuyen) - Float.parseFloat(b.getDXetTuyen()) > 0f) return -1;
        else if(Float.parseFloat(this.DXetTuyen) - Float.parseFloat(b.getDXetTuyen()) == 0f){
            return this.Ma.compareTo(b.getMa());
        }
        return 1;
    }
}
public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("THISINH.in"));
        int t = in.nextInt();
        List<ThiSinh> l = new ArrayList<>();
        while(t-- > 0){
            String ig = in.nextLine();
            l.add(new ThiSinh(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat()));
        }
        int des = in.nextInt();
        float D = 0F;
        Collections.sort(l);
        if(des < l.size()){
            D = Float.parseFloat(l.get(des-1).getDXetTuyen());
        }
        else D = Float.parseFloat(l.get(l.size()-1).getDXetTuyen());
        System.out.printf("%.1f\n", D);
        for(ThiSinh a : l){
             System.out.printf("%s %s%s %s ", a.getMa(), a.getTen(), a.getDUuTien(), a.getDXetTuyen());
             
            if(Float.parseFloat(a.getDXetTuyen()) >= D){
                System.out.printf("%s\n", "TRUNG TUYEN");
            }
            else{
                System.out.printf("%s\n", "TRUOT");
            }
        }
    }
}
