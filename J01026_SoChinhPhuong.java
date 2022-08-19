import java.util.Scanner;
import java.lang.Math;
public class J01026_SoChinhPhuong {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			int n = in.nextInt();
			int x = (int)Math.sqrt(n);
			if(x * x == n) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}
	}
}
