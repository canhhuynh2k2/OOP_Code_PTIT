import java.util.*;
import java.io.*;
public class J07015_SoNguyenToTrongFileNhiPhan {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (ArrayList<Integer>) obj.readObject();
        int a[] = new int[10005];
        for(int x : l){
            if(isPrime(x)) a[x]++;
        }
        for(int i = 0; i <= 10000; i++){
            if(a[i] != 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
