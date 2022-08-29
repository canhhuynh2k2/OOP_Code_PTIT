import java.util.*;
import java.io.*;
public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        int a[] = new int[1005];
        List<Integer> l = (ArrayList<Integer>) obj.readObject();
        for(int x : l){
            a[x]++;
        }
        for(int i = 0; i <= 1000; i++){
            if(a[i] != 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
