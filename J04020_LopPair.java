// @author canhhuynh2k2
import java.util.*;
class Pair<T, S>{
    private T first;
    private S second;
    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        if((Integer)first < 2 || (Integer)second < 2) return false;
        for(int i = 2; i <= Math.sqrt((Integer)first); i++){
            if((Integer)first % i == 0) return false;
        }
        for(int i = 2; i <= Math.sqrt((Integer)second); i++){
            if((Integer)second % i == 0) return false;
        }
        return true;
    }
    public String toString(){
        return first + " " + second;
    }
}
public class J04020_LopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
