import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class Khach{
    private String name, room, number;
    private long numberOfDays;
    public Khach(int c, String s1, String s2, String s3, String s4){
        String Num = String.valueOf(c);
        if(Num.length() < 2) Num = "0" + Num;
        this.number = "KH" + Num;
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String ss = "";
        for(int i = 0; i < s.length; i++){
            ss += s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()) + " ";
        }
        this.name = ss;
        this.room = s2.trim();
        try{
            DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
            Date start = simpleDateFormat.parse(s3);
            Date end = simpleDateFormat.parse(s4);
            long diff = (end.getTime() - start.getTime()) / (24 * 60 * 60 * 1000);
            this.numberOfDays = diff;
        }catch(Exception e){
            e.printStackTrace();
        }
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
    public long getNumberOfDays(){
        return this.numberOfDays;
    }
}
public class J07046_DanhSachLuuTru{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = in.nextInt();
        List<Khach> l = new ArrayList<>();
        String ig = in.nextLine();
        for(int i = 0; i < t; i++){
            l.add(new Khach(i+1, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(l, new Comparator<Khach>(){
            @Override
            public int compare(Khach a, Khach b){
                if(a.getNumberOfDays() > b.getNumberOfDays()) return -1;
                return 1;
            }
        });
        for(Khach x : l){
            System.out.printf("%s %s%s %d\n", x.getNumber(), x.getName(), x.getRoom(), x.getNumberOfDays());
        }
    } 
}
