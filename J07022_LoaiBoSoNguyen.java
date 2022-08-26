import java.util.*;
import java.io.*;
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) {
        try{
            File f = new File("DATA.in");
            Scanner in = new Scanner(f);
            List<String> l = new ArrayList<String>();
            while(in.hasNextLine()){
                String data[] = in.nextLine().split("\\s");
                for(int i = 0; i < data.length; i++){
                    int x = 0;
                    try{
                        x = Integer.parseInt(data[i]);
                    }catch(Exception e){
                        l.add(data[i]);
                    }
                }
            }
            Collections.sort(l);
            for(String s : l){
                System.out.print(s + " ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
