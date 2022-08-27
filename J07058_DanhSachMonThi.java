import java.util.*;
import java.io.*;
class MonHoc implements Comparable<MonHoc>{
    private String Ma, Ten, HinhThuc;
    public MonHoc(String a, String b, String c){
        this.Ma = a;
        this.Ten = b;
        this.HinhThuc = c;
    }
    public String getMa(){
        return this.Ma;
    }
    public String getTen(){
        return this.Ten;
    }
    public String getHinhThuc(){
        return this.HinhThuc;
    }
    public int compareTo(MonHoc a){
        return this.getMa().compareTo(a.getMa());
    }
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = in.nextInt();
        String ig = in.nextLine();
        List<MonHoc> l = new ArrayList<MonHoc>();
        while(t-- > 0){
            MonHoc x = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
            l.add(x);
        }
        Collections.sort(l);
        for(MonHoc x : l){
            System.out.printf("%s %s %s\n", x.getMa(), x.getTen(), x.getHinhThuc());
        }
    }
}
