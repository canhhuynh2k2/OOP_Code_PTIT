import java.util.*;
import java.io.*;
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try{
            File f = new File("DATA.in");
            Scanner scanner = new Scanner(f);
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            ArrayList<Integer> l = new ArrayList<Integer>();
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] a = data.split("\\s+");
                for(int i = 0; i < a.length; i++){
                    int tmp = Integer.parseInt(a[i]);
                    if(h.containsKey(tmp)){
                        h.replace(tmp, h.get(tmp) + 1);
                    }
                    else{
                        l.add(tmp);
                        h.put(tmp, 1);
                    }
                }
            }
            Collections.sort(l);
            for(int x : l){
                System.out.printf("%d %d\n", x, h.get(x));
            }
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
    } 
}
