import java.util.Scanner;
public class J02004_MangDoiXung {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++) a[i] = in.nextInt();
			int ok = 1;
			for(int i = 0; i < n / 2; i++) {
				if(a[i] != a[n-i-1]) {
					ok = 0;
					break;
				}
			}
			if(ok == 1) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}

	}

}
