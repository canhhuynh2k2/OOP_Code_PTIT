import java.util.*;
class PhanSo{
    private long x, y;
    PhanSo(long a, long b){
        this.x = a;
        this.y = b;
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
}
public class J04003_PhanSo {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PhanSo P = new PhanSo(in.nextLong(), in.nextLong());
        P.rutGon();
        System.out.println(P.getX() + "/" + P.getY());
    }
}
