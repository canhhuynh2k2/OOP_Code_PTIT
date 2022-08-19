import java.util.Scanner;
import java.lang.Math;
public class J01005_ChiaTamGiac {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n, t;
		double h;
		t = in.nextInt();
		while(t > 0) {
			n = in.nextInt();
			h = in.nextDouble();
			for(int i = 1; i < n; i++) {
				System.out.print(String.format("%.6f", h*Math.sqrt((double)i/n)) + " ");
			}
			System.out.println();
			t--;
		}

	}

}
