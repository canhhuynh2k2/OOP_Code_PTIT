import java.util.*;
class Time implements Comparable<Time>{
    private int hour, minute, second;
    public Time(int a, int b, int c){
        this.hour = a;
        this.minute = b;
        this.second = c;
    }
    public int getHour(){
        return this.hour;
    }
    public int getSecond(){
        return this.second;
    }
    public int getMinute(){
        return this.minute;
    }
    @Override
    public String toString(){
        return this.hour + " " + this.minute + " " + this.second + "\n";
    }
    @Override
    public int compareTo(Time a){
        int tmp2 = a.getHour() * 60 * 60 + a.getMinute() * 60 + a.getSecond();
        int tmp1 = this.hour * 60 * 60 + this.minute * 60 + this.second;
        return tmp1 - tmp2;
    }

}
public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Time> x = new ArrayList<Time>(t);
        for(int i = 0; i < t; i++){
            Time tmp = new Time(in.nextInt(), in.nextInt(), in.nextInt());
            x.add(tmp);
        }
        Collections.sort(x);
        for(int i = 0; i < t; i++){
            System.out.printf(x.get(i).toString());
        }
    }
}
