import java.util.Scanner;
public class J03008_SoDep3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        String ig = in.nextLine();
        while(t > 0){
            String s = in.nextLine();
            int ok = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                    ok = 0;
                    break;
                }
            }
            StringBuilder str = new StringBuilder(s);
            if(ok == 1 && s.equals(str.reverse().toString())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
