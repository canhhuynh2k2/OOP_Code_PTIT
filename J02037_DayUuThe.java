import java.util.*;
public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t-- > 0){
            String s[] = in.nextLine().split("\\s+");
            int cnt = 0;
            for(int i = 0; i < s.length; i++){
                if(Integer.parseInt(s[i]) % 2 == 0){
                    cnt++;
                }
            }
            if(s.length % 2 == 0 && cnt > s.length - cnt){
                System.out.println("YES");
            }
            else if(s.length % 2 == 1 && s.length - cnt > cnt){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
