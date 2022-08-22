import java.util.*;
public class J03032_DaoTu {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t-- > 0){
            String[] s = in.nextLine().split("\\s");
            for(int i = 0; i < s.length; i++){
                StringBuilder str = new StringBuilder(s[i]);
                System.out.print(str.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
