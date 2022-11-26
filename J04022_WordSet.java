// @author canhhuynh2k2
import java.util.*;
class WordSet{
    private Set<String> st;
    public WordSet(String s){
        st = new TreeSet<String>();
        String ss[] = s.toLowerCase().split("\\s+");
        for(String x : ss){
            st.add(x);
        }
    }
    public String union(WordSet a){
        Set<String> st1 = new TreeSet<>();
        for(String x : st){
            st1.add(x);
        }
        for(String x : a.getSet()){
            st1.add(x);
        }
        String ans = "";
        for(String x : st1){
            ans += x + " ";
        }
        return ans;
    }
    public String intersection(WordSet a){
        Map<String, Integer> hm = new HashMap<>();
        Set<String> st1 = new TreeSet<>();
        for(String x : st){
            hm.put(x, 1);
        }
        for(String x : a.getSet()){
            if(hm.containsKey(x)){
                st1.add(x);
            }
        }
        String ans = "";
        for(String x : st1){
            ans += x + " ";
        }
        return ans;
    }
    public Set<String> getSet(){
        return st;
    }
}
public class J04022_WordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
