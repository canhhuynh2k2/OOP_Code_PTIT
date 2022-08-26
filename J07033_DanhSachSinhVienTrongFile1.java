import java.util.*;
import java.io.*;
class SinhVien{
    private String NumSV, NameSV, Class, Mail;
    public SinhVien(String a, String b, String c, String d){
        this.NumSV = a;
        this.NameSV = b;
        this.Class = c;
        this.Mail = d;
    }
    public String getNumSV(){
        return this.NumSV;
    }
    public String getNameSV(){
        return this.NameSV;
    }
    public String getclass(){
        return this.Class;
    }
    public String getMail(){
        return this.Mail;
    }
}
public class J07033_DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) {
        try{
            File f = new File("SINHVIEN.in");
            Scanner in = new Scanner(f);
            int t = in.nextInt();
            String ig = in.nextLine();
            List<SinhVien> l = new ArrayList<SinhVien>(t);
            while(in.hasNextLine()){
                String a = in.nextLine();
                String b[] = in.nextLine().toLowerCase().trim().split("\\s+");
                String s = "";
                for(String ss : b){
                    s += ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
                }
                String c = in.nextLine();
                String d = in.nextLine();
                SinhVien x = new SinhVien(a, s, c, d);
                l.add(x);
            }
            Collections.sort(l, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien a, SinhVien b){
                    return a.getNumSV().compareTo(b.getNumSV());
                }
            });
            for(SinhVien s : l){
                System.out.printf("%s %s%s %s\n", s.getNumSV(), s.getNameSV(), s.getclass(), s.getMail());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
