import java.util.Scanner;
public class J01006_TinhSoFibonacci {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t, n;
		t = in.nextInt();
		while(t > 0) {
			n = in.nextInt();
			Long a[] = new Long[100];
			a[1] = 1L;
			a[2] = 1L;
			for(int i = 3; i <= n; i++) {
				a[i] = a[i-1] + a[i-2];
			}
			System.out.println(a[n]);
			t--;
		}
	}
}
