/* @author canhhuynh2k2 */
import java.util.*;
public class J08027_GoBanPhim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayDeque<Character> a = new ArrayDeque<Character>();
        ArrayDeque<Character> b = new ArrayDeque<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '<'){
                if(a.size() > 0){
                    b.push(a.pop());
                }
            }
            else if(s.charAt(i) == '>'){
                if(b.size() > 0){
                    a.push(b.pop());
                }
            }
            else if(s.charAt(i) == '-'){
                if(a.size() > 0){
                    a.pop();
                }
            }
            else{
                a.push(s.charAt(i));
            }
        }
        while(a.size() > 0){
            b.push(a.pop());
        }
        while(b.size() > 0){
            System.out.printf("%c", b.pop());
        }
    }
}
