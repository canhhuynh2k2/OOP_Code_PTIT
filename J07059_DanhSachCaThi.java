/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class CaThi implements Comparable<CaThi>{
    private String ma, ngay, gio, phong, compareDate;
    public CaThi(int c, String s1, String s2, String s3){
        String Ma = String.valueOf(c);
        while(Ma.length() < 3) Ma = "0" + Ma;
        this.ma = "C" + Ma;
        this.ngay = s1;
        this.compareDate = s1.substring(6, 10) + s1.substring(2, 5) + "/" + s1.substring(0, 2);
        this.gio = s2;
        this.phong = s3;
    }
    public String getMa(){
        return this.ma;
    }
    public String getNgay(){
        return this.ngay;
    }
    public String getGio(){
        return this.gio;
    }
    public String getPhong(){
        return this.phong;
    }
    public String getCompareDate(){
        return this.compareDate;
    }
    @Override
    public int compareTo(CaThi a){
        if(this.compareDate.compareTo(a.getCompareDate()) < 0) return -1;
        else if(this.compareDate.compareTo(a.getCompareDate()) == 0){
            if(this.gio.compareTo(a.getGio()) < 0) return -1;
            else if(this.gio.compareTo(a.getGio()) == 0){
                return this.ma.compareTo(a.getMa());
            }
        }
        return 1;
    }
}
public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("CATHI.in"));
        List<CaThi> l = new ArrayList<>();
        int t = in.nextInt();
        String ig = in.nextLine();
        for(int i = 1; i <= t; i++){
            l.add(new CaThi(i, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(l);
        for(CaThi x : l){
            System.out.printf("%s %s %s %s\n", x.getMa(), x.getNgay(), x.getGio(), x.getPhong());
        }
    }
}
