/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
class ChuanHoa{
    private String ho, ten, hoTen;
    public ChuanHoa(String s){
        String x[] = s.trim().toLowerCase().split("\\s+");
        String name = "";
        for(String ss : x){
            if(ss.length() > 0) name = name + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.hoTen = name;
        String Ho = "";
        for(int i = 0; i < x.length - 1; i++){
            if(x[i].length() > 0){
                Ho += x[i].substring(0, 1).toUpperCase() + x[i].substring(1).toLowerCase() + " ";
            }
        }
        this.ho = Ho;
        this.ten = "";
        this.ten = x[x.length - 1].substring(0, 1).toUpperCase() + x[x.length - 1].substring(1).toLowerCase();  
    }
    public String getHo(){
        return this.ho;
    }
    public String getTen(){
        return this.ten;
    }
    public String getHoTen(){
        return this.hoTen;
    }
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        List<ChuanHoa> l = new ArrayList<>();
        while(in.hasNextLine()){
            l.add(new ChuanHoa(in.nextLine()));
        }
        Collections.sort(l, new Comparator<ChuanHoa>(){
            @Override
            public int compare(ChuanHoa a, ChuanHoa b){
                if(a.getTen().compareTo(b.getTen()) < 0) return -1;
                else if(a.getTen().compareTo(b.getTen()) == 0){
                    if(a.getHo().compareTo(b.getHo()) < 0) return -1;
                }
                return 1;
            }
        });
        for(ChuanHoa x : l){
            System.out.println(x.getHoTen());
        }
    }
}
