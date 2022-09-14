import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class KhachHang{
    private String name, room, number;
    private long Price ,numberOfDays;
    public KhachHang(int n, String a, String b, String c, String d, int e){
        String Num = String.valueOf(n);
        if(Num.length() == 1) Num = "0" + Num;
        Num = "KH" + Num;
        this.number = Num;
        String s[] = a.trim().toLowerCase().split("\\s+");
        String ss = "";
        for(int i = 0; i < s.length; i++){
            ss += s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()) + " ";
        }
        this.name = ss;
        this.room = b.trim();
        if(c.charAt(1) == '/') c = "0" + c;
        if(c.charAt(4) == '/') c = c.substring(0, 3) + "0" + c.substring(3);
        if(d.charAt(1) == '/') d = "0" + d;
        if(d.charAt(4) == '/') d = d.substring(0, 3) + "0" + d.substring(3);
        try{
            DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            Date start = simpleDateFormat.parse(c);
            Date end = simpleDateFormat.parse(d);
            this.numberOfDays = (end.getTime() - start.getTime()) / (24 * 60 * 60 * 1000) + 1;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        int price = 0;
        if(this.room.charAt(0) == '1') price = 25;
        else if(this.room.charAt(0) == '2') price = 34;
        else if(this.room.charAt(0) == '3') price = 50;
        else price = 80;
        this.Price = price * this.numberOfDays + e;
    }
    public String getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    public String getRoom(){
        return this.room;
    }
    public long getPrice(){
        return this.Price;
    }
    public long getNumberOfDays(){
        return this.numberOfDays;
    }
}
public class J07051_TinhTienPhong {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        List<KhachHang> l = new ArrayList<KhachHang>();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String ig = in.nextLine();
            String s = "", ss = "";
            int r = 0;
            while(in.hasNextLine()){
                ss = in.nextLine();
                if(ss.trim().charAt(0) <= '9' && ss.trim().charAt(0) >= '0') break;
                else s = s + " " + ss;
            }
            l.add(new KhachHang(i+1, s, ss, in.nextLine(), in.nextLine(), in.nextInt()));
        }
        Collections.sort(l, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                if(a.getPrice() > b.getPrice()) return -1;
                else if(a.getPrice() == b.getPrice()){
                    return b.getNumber().compareTo(a.getNumber());
                }
                return 1;
            }
        });
        for(KhachHang x : l){
            System.out.printf("%s %s%s %d %d\n", x.getNumber(), x.getName(), x.getRoom(), x.getNumberOfDays(), x.getPrice());
        }
    }
}
