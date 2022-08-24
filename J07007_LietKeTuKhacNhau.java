import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class WordSet{
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    ArrayList<String> arr = new ArrayList<String>();
    WordSet(String ss){  
            try{
            File f = new File(ss);
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String l[] = data.toLowerCase().split("\\s+");
                for(String s : l){
                    if(h.containsKey(s)){
                        h.replace(s, h.get(s) + 1);
                    }
                    else{
                        h.put(s, 1);
                        arr.add(s);
                    }
                }
            }
            Collections.sort(arr);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String toString(){
        String ans = "";
        for(String s : arr){
            ans += s + "\n";
        }
        return ans;
    }
}
public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
