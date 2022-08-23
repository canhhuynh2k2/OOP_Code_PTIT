import java.util.*;
class SinhVien{
    String name, age;
    float m1, m2, m3, sum;
    void Input(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextLine();
        m1 = in.nextFloat();
        m2 = in.nextFloat();
        m3 = in.nextFloat();
        sum = m1 + m2 + m3;
    }
    void Output(){
        System.out.printf("%s %s %.1f", this.name, this.age, this.sum);
    }
}
public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.Input();
        sv.Output();
    }
}
