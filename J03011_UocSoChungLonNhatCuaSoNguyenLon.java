import java.util.*;
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t > 0){
            long n = in.nextLong();
            String ig = in.nextLine();
            String s = in.nextLine();
            long x = 0L;
            for(int i = 0; i < s.length(); i++){
                x = (x * 10 + (s.charAt(i) - 48)) % n;
            }
            while(n != 0){
                long tmp = x % n;
                x = n;
                n = tmp;
            }
            System.out.println(x);
            t--;
        }
    }
}
