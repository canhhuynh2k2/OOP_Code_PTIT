import java.util.*;
import java.io.*;
public class J07029_SoNguyenToLonNhatTrongFile {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) obj.readObject();
        int a[] = new int[1000005];
        for(int x : l){
            if(isPrime(x)) a[x]++;
        }
        int i = 1000000, cnt = 0;
        while(i >= 0){
            if(a[i] != 0){
                System.out.println(i + " " + a[i]);
                cnt++;
            }
            if(cnt == 10) break;
            i--;
        }
    }
}
