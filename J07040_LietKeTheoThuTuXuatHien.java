/* @author canhhuynh2k2 */
import java.util.*;
import java.io.*;
public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        BufferedReader f = new BufferedReader(new FileReader(new File("VANBAN.in")));
        List<String> l = (ArrayList<String>) obj.readObject();
        Set<String> st = new TreeSet<>();
        for(String ss : l){
            String tmp[] = ss.trim().toLowerCase().split("\\s+");
            st.addAll(Arrays.asList(tmp));
        }
        String line = f.readLine();
        while(line != null){
            String[] a = line.toLowerCase().split("\\s+");
            for(String b : a){
                if(b.length() > 0 && st.contains(b)){
                    System.out.printf("%s\n", b);
                    st.remove(b);
                }
            }
            line = f.readLine();
        }
    }
}
