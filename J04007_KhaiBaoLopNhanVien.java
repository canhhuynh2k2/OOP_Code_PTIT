import java.util.Scanner;
class NhanVien{
    String MaNV = "00001";
    String name, gender, bornDate, Address, taxNum, signDate;
    void Input(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        gender = in.nextLine();
        bornDate = in.nextLine();
        Address = in.nextLine();
        taxNum = in.nextLine();
        signDate = in.nextLine();
    }
    void Output(){
        System.out.printf("%s %s %s %s %s %s %s", MaNV, name, gender, bornDate, Address, taxNum, signDate);
    }
}
public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.Input();
        nv.Output();
    }
}
