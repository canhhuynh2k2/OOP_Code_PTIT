import java.util.Scanner;
class SinhVien{
    String Name, Class, BornDate;
    float Mark;
    void Input(){
        Scanner in = new Scanner(System.in);
        Name = in.nextLine();
        Class = in.next();
        BornDate = in.next();
        Mark = in.nextFloat();
        StringBuilder s = new StringBuilder(BornDate);
        if(s.charAt(1) == '/'){
            s.insert(0, '0');
        }
        if(s.charAt(4) == '/'){
            s.insert(3, '0');
        }
        BornDate = s.toString();
    }
    void Output(){
        System.out.printf("B20DCCN001 %s %s %s %.2f", Name, Class, BornDate, Mark);
    }
}
public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.Input();
        sv.Output();
    }
}
