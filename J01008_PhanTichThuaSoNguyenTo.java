import java.util.Scanner;
import java.lang.Math;
public class J01008_PhanTichThuaSoNguyenTo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		for(int test = 1; test <= t; test++) {
			int n = in.nextInt();
			System.out.print("Test " + test + ": ");
			for(int i = 2; i <= Math.sqrt(n); i++) {
				int ok = 0, cnt = 0;
				while(n % i == 0) {
					n /= i;
					ok = 1;
					cnt++;
				}
				if(ok == 1) System.out.print(String.format("%d(%d) ", i, cnt));
			}
			if(n != 1) System.out.print(String.format("%d(%d) ", n, 1));
			System.out.println();
		}

	}

}
