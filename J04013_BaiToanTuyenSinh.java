/* @author canhhuynh2k2 */
import java.util.*;
class SinhV{
    private String id, name, result;
    private float bonusScore, totalScore;
    public SinhV(String s1, String s2, float d1, float d2, float d3){
        this.id = s1;
        this.name = s2;
        if(this.id.substring(0, 3).compareTo("KV1") == 0) this.bonusScore = 0.5f;
        else if(this.id.substring(0, 3).compareTo("KV2") == 0) this.bonusScore = 1.0f;
        else this.bonusScore = 2.5f;
        this.totalScore = d1*2 + d2 + d3;
        if(this.totalScore + this.bonusScore >= 24.0f) this.result = "TRUNG TUYEN";
        else this.result = "TRUOT";
    }
    public String toString(){
        String ans = this.id + " " + this.name + " ";
        if(this.bonusScore - (int)this.bonusScore == 0.0f) ans += String.valueOf((int)this.bonusScore) + " ";
        else{
            int i = String.valueOf(this.bonusScore).indexOf(".");
            ans += String.valueOf(this.bonusScore).substring(0, i+2) + " ";
        }
        if(this.totalScore - (int)this.totalScore == 0.0f) ans += String.valueOf((int)this.totalScore) + " ";
        else{
            int i = String.valueOf(this.totalScore).indexOf(".");
            ans += String.valueOf(this.totalScore).substring(0, i+2) + " ";
        }
        ans += this.result;
        return ans;
    }
}
public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhV a = new SinhV(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat());
        System.out.println(a);
    }
}
