import java.util.*;
class MatHang{
    private String numMH, nameMH, Unit;
    private int purPrice, salePrice, profit;
    public MatHang(String s1, String s2, String s3, int n1, int n2, int n3){
        this.numMH = s1;
        this.nameMH = s2;
        this.Unit = s3;
        this.purPrice = n1;
        this.salePrice = n2;
        this.profit = n3;
    }
    public String getNumMH(){
        return this.numMH;
    }
    public String getNameMH(){
        return this.nameMH;
    }
    public String getUnit(){
        return this.Unit;
    }
    public int getPurPrice(){
        return this.purPrice;
    }
    public int getSalePrice(){
        return this.salePrice;
    }
    public int getProfit(){
        return this.profit;
    }
    public static Comparator<MatHang> comparator = new Comparator<MatHang>(){
        public int compare(MatHang a, MatHang b){
            int tmp = b.getProfit() - a.getProfit();
            if(tmp != 0) return tmp;
            return a.getNumMH().compareTo(b.getNumMH());
        }
    };
}
public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        //String ig = in.nextLine();
        MatHang mh[] = new MatHang[m];
        for(int i = 0; i < m; i++){
            String ig = in.nextLine();
            String num = String.valueOf(i+1);
            while(num.length() < 3) num = "0" + num;
            num = "MH" + num;
            String Name  = in.nextLine();
            String unit  = in.nextLine();
            int purchase = in.nextInt();
            int sale = in.nextInt();
            int Profit = sale - purchase;
            mh[i] = new MatHang(num, Name, unit, purchase, sale, Profit);
        }
        Arrays.sort(mh, MatHang.comparator);
        for(int i = 0; i < m; i++){
            System.out.printf("%s %s %s %d %d %d\n", mh[i].getNumMH(), mh[i].getNameMH(), mh[i].getUnit(), mh[i].getPurPrice(), mh[i].getSalePrice(), mh[i].getProfit());
        }
    }
}
