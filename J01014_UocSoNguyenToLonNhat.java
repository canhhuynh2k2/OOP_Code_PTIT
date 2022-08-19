import java.util.Scanner;
import java.lang.Math;
public class J01014_UocSoNguyenToLonNhat {
	static Scanner in = new Scanner(System.in);
	static boolean isPrime(long n) {
		if(n < 2L) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			long n = in.nextLong();
			long ans = 0;
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					if(isPrime(i)) ans = Math.max(ans, i);
					if(isPrime(n/i)) ans = Math.max(ans, (int)n/i);
				}
				while(n % i == 0) n /= i;
			}
			if(n != 1) ans = Math.max(ans, n);
			System.out.println(ans);
			t--;
		}

	}

}
 