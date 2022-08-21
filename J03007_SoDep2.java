import java.util.Scanner;
public class J03007_SoDep2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t > 0){
            String s = in.nextLine();
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                sum += (int)s.charAt(i) - 48;
            }
            StringBuilder str = new StringBuilder(s);
            if(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8' && sum % 10 == 0 && s.equals(str.reverse().toString())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
