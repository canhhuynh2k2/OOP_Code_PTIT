import java.util.*;
import java.io.*;
class SanPham{
    private String ID, name;
    private int price, date;
    public SanPham(String a, String b, int c, int d){
        this.ID = a;
        this.name = b;
        this.price = c;
        this.date = d;
    }
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getDate(){
        return this.date;
    }
    public static Comparator<SanPham> comparator = new Comparator<SanPham>(){
        public int compare(SanPham a, SanPham b){
            if(b.getPrice() > a.getPrice()) return 1;
            else if(b.getPrice() == a.getPrice()){
                return a.getID().compareTo(b.getID());
            }
            else return -1;
        }
    };
}
public class J07048_DanhSachSanPham2 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int t = in.nextInt();
        List<SanPham> l = new ArrayList<SanPham>();
        while(t-- > 0){
            String ig = in.nextLine();
            SanPham x = new SanPham(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt());
            l.add(x);
        }
        Collections.sort(l, SanPham.comparator);
        for(SanPham s : l){
            System.out.printf("%s %s %d %d\n", s.getID(), s.getName(), s.getPrice(), s.getDate());
        }
    }
}
