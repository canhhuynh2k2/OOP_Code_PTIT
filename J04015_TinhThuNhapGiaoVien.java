import java.util.*;
class ThuNhapGiaoVien{
    String MaGV, name, Ma;
    int Basic, level, allowance, sum;
    void Input(){
        Scanner in = new Scanner(System.in);
        MaGV = in.nextLine();
        name = in.nextLine();
        Basic = in.nextInt();
        Ma = MaGV.substring(0, 2);
        level = Integer.parseInt(MaGV.substring(2, MaGV.length()));
        if(Ma.equals("HT")){
            allowance = 2000000;
        }
        else if(Ma.equals("HP")){
            allowance = 900000;
        }
        else{
            allowance = 500000;
        }
        sum = allowance + Basic * level;
    }
    void Output(){
        System.out.printf("%s %s %d %d %d", MaGV, name, level, allowance, sum);
    }
}
public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        ThuNhapGiaoVien x = new ThuNhapGiaoVien();
        x.Input();
        x.Output();
    }
}
