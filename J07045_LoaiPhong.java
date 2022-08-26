import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String Loai, Ten, Gia, Phi;
    public LoaiPhong(String s){
        String data[] = s.split("\\s+");
        this.Loai = data[0];
        this.Ten = data[1];
        this.Gia = data[2];
        this.Phi = data[3];
    }
    public String getLoai(){
        return this.Loai;
    }
    public String getTen(){
        return this.Ten;
    }
    public String getGia(){
        return this.Gia;
    }
    public String getPhi(){
        return this.Phi;
    }
    public int compareTo(LoaiPhong a){
        return this.Ten.compareTo(a.getTen());
    }
    public String toString(){
        return this.Loai + " " + this.Ten + " " + this.Gia + " " + this.Phi;
    }
}
public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
