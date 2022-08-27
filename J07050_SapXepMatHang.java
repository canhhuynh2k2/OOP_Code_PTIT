import java.util.*;
import java.io.*;
class MatHang{
    private String Ma, Ten, Nhom;
    private Float LoiNhuan;
    public MatHang(String a, String b, String c, Float d){
        this.Ma = a;
        this.Ten = b;
        this.Nhom = c;
        this.LoiNhuan = d;
    }
    public String getMa(){
        return this.Ma;
    }
    public String getTen(){
        return this.Ten;
    }
    public String getNhom(){
        return this.Nhom;
    }
    public Float getLoiNhuan(){
        return this.LoiNhuan;
    }
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("MATHANG.in"));
            int n = in.nextInt();
            String ig = in.nextLine();
            List<MatHang> l = new ArrayList<MatHang>();
            for(int i = 1; i <= n; i++){
                String s = String.valueOf(i);
                while(s.length() < 2) s = "0" + s;
                s = "MH" + s;
                String a =  in.nextLine();
                String b = in.nextLine();
                float c = Float.parseFloat(in.nextLine());
                float d = Float.parseFloat(in.nextLine());
                d = d - c;
                MatHang x = new MatHang(s, a, b, d);
                l.add(x);
            }
            Collections.sort(l, new Comparator<MatHang>(){
                @Override
                public int compare(MatHang a, MatHang b){
                    if(b.getLoiNhuan() - a.getLoiNhuan() > 0F) return 1;
                    else return -1;
                }
            });
            for(MatHang s : l){
                System.out.printf("%s %s %s %.2f\n", s.getMa(), s.getTen(), s.getNhom(), s.getLoiNhuan());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
