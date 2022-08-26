import java.util.*;
import java.io.*;
class MonHoc{
    private String numSub, nameSub, num;
    public MonHoc(String a, String b, String c){
        this.numSub = a;
        this.nameSub = b;
        this.num = c;
    }
    public String getNumSub(){
        return this.numSub;
    }
    public String getNameSub(){
        return this.nameSub;
    }
    public String getNum(){
        return this.num;
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) {
        try{
            File f = new File("MONHOC.in");
            Scanner in = new Scanner(f);
            int t = in.nextInt();
            String ig = in.nextLine();
            Vector<MonHoc> v = new Vector<MonHoc>(t);
            while(in.hasNextLine()){
                MonHoc x = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
                v.add(x);  
            }
            Collections.sort(v, new Comparator<MonHoc>(){
                @Override
                public int compare(MonHoc a, MonHoc b){
                    return a.getNameSub().compareTo(b.getNameSub());
                }
            });
            for(MonHoc s : v){
                System.out.printf("%s %s %s\n", s.getNumSub(), s.getNameSub(), s.getNum());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
