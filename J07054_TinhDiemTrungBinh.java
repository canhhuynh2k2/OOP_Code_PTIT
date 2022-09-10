/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class Sinhvien1 implements Comparable<Sinhvien1>{
    private String ma, ten;
    private float diem;
    public Sinhvien1(String s1, int f1, int f2, int f3, int c){
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : s){
            name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.ten = name;
        String Ma = String.valueOf(c);
        if(Ma.length() == 1) Ma = "0" + Ma;
        this.ma = "SV" + Ma;
        this.diem = (float)(f1*3 + f2*3 +f3*2) / 8;
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
    @Override
    public int compareTo(Sinhvien1 a){
        int x = (int)(this.diem * 100);
        int y = (int)(a.getDiem() * 100);
        if(y > x) return 1;
        else if(y == x){
            return this.ma.compareTo(a.getMa());
        }
        return -1;
    }
}
public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        List<Sinhvien1> l = new ArrayList<>();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String ig = in.nextLine();
            l.add(new Sinhvien1(in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt(), i+1));
        }
        float curr = -1f;
        int rank = 1;
        Collections.sort(l);
        for(int i = 0; i < l.size(); i++){
            int y = (int)(l.get(i).getDiem() * 100);
            System.out.printf("%s %s%.2f ", l.get(i).getMa(), l.get(i).getTen(), l.get(i).getDiem());
            if((float)y / 100 != curr){
                curr = (float)y / 100;
                rank = i+1;
            }
            System.out.println(rank);
        }
    }
}
