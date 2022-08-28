import java.util.*;
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Queue<Integer> q = new LinkedList<Integer>();
            q.offer(9);
            while(q.size() > 0){
                int d = q.poll();
                if(d % n == 0){
                    System.out.println(d);
                    break;
                }
                q.offer(d * 10);
                q.offer(d * 10 + 9);
            }
        }
    }
}
