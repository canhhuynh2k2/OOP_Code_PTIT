import java.util.Scanner;
public class J01007_KiemTraSoFibinacci {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t;
		t = in.nextInt();
		long a[] = new long[100];
		a[0] = 0L;
		a[1] = 1L;
		for(int i = 2; i <= 93; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		while(t > 0) {
			long n = in.nextLong();
			int ok = 1, i = 0;
			while(a[i] < n) i++;
			if(a[i] == n) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}
	}

}
