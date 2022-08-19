import java.util.Scanner;
import java.util.Scanner;
public class J01012_UocSoChiaHetCho2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			int n = in.nextInt();
			int ans = 0, m = (int)Math.sqrt(n);
			for(int i = 2; i <= m; i++) {
				if(n % i == 0) {
					if(i % 2 == 0) ans++;
					if((n / i) % 2 == 0) ans++;
				}
			}
			if(m * m == n && m % 2 == 0) ans--;
			if(n % 2 == 0) ans++;
			System.out.println(ans);
			t--;
		}

	}

}
