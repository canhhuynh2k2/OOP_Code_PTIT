import java.util.Scanner;
import java.util.HashMap;
public class J02034_BoSungDaySo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt(), x = 0;
		int a[] = new int[n], ok = 0;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if(a[i] > x) x = a[i];
			h.put(a[i], 1);
		}
		for(int i = 1; i <= x; i++) {
			if(!h.containsKey(i)) {
				ok = 1;
				System.out.println(i);
			}
		}
		if(ok == 0) System.out.println("Excellent!");
	}
}
