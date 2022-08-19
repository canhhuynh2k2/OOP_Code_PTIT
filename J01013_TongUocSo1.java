import java.util.Scanner;
import java.lang.Math;
public class J01013_TongUocSo1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		long ans = 0;
		long a[] = new long[2000005];
		for(int i = 2; i <= 2000001; i++) {
			if(a[i] == 0L) {
				a[i] = i;
				for(int j = i*2; j <= 2000001; j+=i) {
					int k = j;
					while(k % i == 0) {
						a[j] += i;
						k /= i;
					}
				}
			}
		}
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			ans += a[x];
		}
		System.out.println(ans);
	}

}
