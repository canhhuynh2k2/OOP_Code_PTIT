import java.util.*;
class PhanSo{
    private long x, y;
    PhanSo(long a, long b){
        this.x = a;
        this.y = b;
    }
    void setX(long c){
        this.x = c;
    }
    void setY(long c){
        this.y = c;
    }
    long getX(){
        return this.x;
    }
    long getY(){
        return this.y;
    }
    static long gcd(long a, long b){
        while(b != 0){
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    void rutGon(){
        long tmp = gcd(this.x, this.y);
        this.x /= tmp;
        this.y /= tmp;
    }
    static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    public static PhanSo solve(PhanSo p1, PhanSo p2){
        long tmp = lcm(p1.getY(), p2.getY());
        p1.setX(p1.getX() * (tmp / p1.getY()));
        p2.setX(p2.getX() * (tmp / p2.getY()));
        PhanSo ans = new PhanSo(0L, 0L);
        ans.setX(p1.getX() + p2.getX());
        ans.setY(tmp);
        ans.rutGon();
        return ans;
    }
}
public class J04004_TongPhanSo {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(in.nextLong(), in.nextLong());
        PhanSo p2 = new PhanSo(in.nextLong(), in.nextLong());
        p1.rutGon();
        p2.rutGon();
        PhanSo ans = p1.solve(p1, p2);
        System.out.println(ans.getX() + "/" + ans.getY());
    }
}
