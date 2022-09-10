/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class KH implements Comparable<KH>{
    private String ma, ten;
    private int tienTrongDM, tienVuotDM, tongTien, VAT;
    public KH(Character c, String s1, int a, int b, int d){
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        String Ma = String.valueOf(d);
        if(Ma.length() == 1) Ma = "0" + Ma;
        this.ma = "KH" + Ma;
        int DM = 0;
        if(c == 'A') DM = 100;
        else if(c == 'B') DM = 500;
        else DM = 200;
        if(b - a <= DM){
            this.tienTrongDM = (b-a) * 450;
            this.tienVuotDM = 0;
        }
        else{
            this.tienTrongDM = 450 * DM;
            this.tienVuotDM = (b-a-DM) * 1000;
        }
        this.VAT = this.tienVuotDM * 5 / 100;
        this.tongTien = this.tienTrongDM + this.tienVuotDM + this.VAT;
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public int getTienTrongDM(){
        return this.tienTrongDM;
    }
    public int getTienVuotDM(){
        return this.tienVuotDM;
    }
    public int getTongTien(){
        return this.tongTien;
    }
    public int getVAT(){
        return this.VAT;
    }
    @Override
    public int compareTo(KH a){
        return  a.getTongTien() - this.tongTien;
    }
}
public class J07056_TinhTienDien {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        List<KH> l = new ArrayList<>();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String ig = in.nextLine();
            String name = in.nextLine();
            l.add(new KH(in.next().charAt(0), name, in.nextInt(), in.nextInt(), i+1));
        }
        Collections.sort(l);
        for(KH x : l){
            System.out.printf("%s %s%d %d %d %d\n", x.getMa(), x.getTen(), x.getTienTrongDM(), x.getTienVuotDM(), x.getVAT(), x.getTongTien());
        }
    }
}
