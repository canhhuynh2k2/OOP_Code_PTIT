import java.util.*;
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Queue<String> q = new LinkedList<String>();
            List<String> l = new ArrayList<String>();
            q.offer("6");
            q.offer("8");
            while(q.size() > 0){
                String s = q.poll();
                l.add(s);
                if(s.length() < n){
                    q.offer(s + "6");
                    q.offer(s + "8");
                }
            }
            System.out.println(l.size());
            for(int i = l.size() - 1; i >= 0; i--){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
}
