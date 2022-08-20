import java.util.Scanner;
import java.lang.Math;
public class J02022_SoXaCach {
	static Scanner in = new Scanner(System.in);
	static int n, a[] = new int[15], b[] = new int[15];
	static void Try(int i) {
		for(int j = 1; j <= n; j++) {
			if(b[j] == 0) {
				b[j] = 1;
				a[i] = j;
				if(i == n) {
					int ok = 1;
					for(int d = 2; d <= n; d++) {
						if(Math.abs(a[d] - a[d-1]) == 1) {
							ok = 0;
							break;
						}
					}
					if(ok == 1) {
						for(int d = 1; d <= n; d++) System.out.print(a[d]);
						System.out.println();
					}
				}
				else Try(i+1);
				b[j] = 0;
			}
		}
	}
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			n = in.nextInt();
			Try(1);
			t--;
		}

	}

}
