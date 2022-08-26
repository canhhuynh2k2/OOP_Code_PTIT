import java.util.*;
import java.io.*;
class DoanhNghiep{
    private String ID, name, num;
    public DoanhNghiep(String a, String b, String c){
        this.ID = a;
        this.name = b;
        this.num = c;
    }
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public String getNum(){
        return this.num;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) {
        try{
            File f = new File("DN.in");
            Scanner in = new Scanner(f);
            int t = in.nextInt();
            String ig = in.nextLine();
            List<DoanhNghiep> l = new ArrayList<DoanhNghiep>();
            while(in.hasNextLine()){
                DoanhNghiep x = new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine());
                l.add(x);
            }
            Collections.sort(l, new Comparator<DoanhNghiep>(){
                @Override
                public int compare(DoanhNghiep a, DoanhNghiep b){
                    return a.getID().compareTo(b.getID());
                }
            });
            for(DoanhNghiep s : l){
                System.out.printf("%s %s %s\n", s.getID(), s.getName(), s.getNum());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
