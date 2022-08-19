import java.util.Scanner;
public class J02014_DiemCanBang {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t > 0) {
			int n = in.nextInt();
			int a[] = new int[n+1];
			for(int i = 1; i <= n; i++) {
				int x = in.nextInt();
				a[i] = a[i-1] + x;
			}
			boolean ok = false;
			for(int i = 1; i <= n; i++) {
				if(a[i-1] == a[n] - a[i]) {
					ok = true;
					System.out.println(i);
					break;
				}
			}
			if(!ok) System.out.println(-1);
			t--;
		}

	}

}
