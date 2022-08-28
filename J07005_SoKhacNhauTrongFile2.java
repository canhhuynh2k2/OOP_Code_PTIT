import java.io.*;
import java.util.*;
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        List<Integer> arr = new ArrayList<Integer>();
        DataInputStream f = new DataInputStream(new FileInputStream("DATA.IN"));
        for(int i = 0; i < 100000; i++){
            int s = f.readInt();
            if(h.containsKey(s)) h.replace(s, h.get(s) + 1);
            else{
                h.put(s, 1);
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(int x : arr){
            System.out.printf("%d %d\n", x, h.get(x));
        }
    }
}
