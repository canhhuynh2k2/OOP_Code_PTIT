/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class Online{
    private String name;
    private long time;
    public Online(String s1, String s2, String s3){
        this.name = s1.trim();
        try{
            DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date start = simpleDateFormat.parse(s2);
            Date end = simpleDateFormat.parse(s3);
            this.time = (end.getTime() - start.getTime()) / (60 * 1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getName(){
        return this.name;
    }
    public long getTime(){
        return this.time;
    }
}
public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("ONLINE.in"));
        int t = in.nextInt();
        String ig = in.nextLine();
        List<Online> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new Online(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(l, new Comparator<Online>(){
            @Override
            public int compare(Online a, Online b){
                if(a.getTime() > b.getTime()) return -1;
                else if(a.getTime() == b.getTime()){
                    return a.getName().compareTo(b.getName());
                }
                return 1;
            }
        });
        for(Online x : l){
            System.out.printf("%s %d\n", x.getName(), x.getTime());
        }
    }
}
