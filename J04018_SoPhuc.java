// @author canhhuynh2k2
import java.util.*;
class SoPhuc{
    int x, y;
    public SoPhuc(int a, int b){
        x = a;
        y = b;
    }
    public static SoPhuc C(SoPhuc A, SoPhuc B){
        SoPhuc tmp = new SoPhuc(A.x + B.x, A.y + B.y);
        SoPhuc tmp2 = new SoPhuc(tmp.x * A.x - tmp.y * A.y, tmp.x * A.y + tmp.y * A.x);
        return tmp2;
    }
    public static SoPhuc D(SoPhuc A, SoPhuc B){
        SoPhuc tmp = new SoPhuc(A.x + B.x, A.y + B.y);
        SoPhuc tmp2 = new SoPhuc(tmp.x * tmp.x - tmp.y * tmp.y, tmp.x * tmp.y + tmp.y * tmp.x);
        return tmp2;
    }
    public String toString(){
        return x + " + " + y + "i";
    }
}
public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C = SoPhuc.C(A, B);
            SoPhuc D = SoPhuc.D(A, B);
            System.out.println(C + ", " + D);
        }
    }
}
