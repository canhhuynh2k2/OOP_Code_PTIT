import java.util.Scanner;
public class J01011_BoiSoChung_UocSoChung {
	static Scanner in = new Scanner(System.in);
	static int USCLN(int a, int b) {
		while(b != 0) {
			int x = a % b;
			a = b;
			b = x;
		}
		return a;
	}
	public static void main(String[] args) {
		int t = in.nextInt();
		int a, b;
		while(t > 0) {
			a = in.nextInt();
			b = in.nextInt();
			int n = USCLN(a, b);
			System.out.println((long)a * b / n + " " + n);
			t--;
		}
	}

}
