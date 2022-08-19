import java.util.Scanner;
import java.util.Arrays;
public class J02005_GiaoCuaHaiDaySo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int a[] = new int[1005];
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			a[x] = 1;
		}
		int cnt = 0;
		int b[] = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		int arr[] = Arrays.copyOf(b, b.length);
		Arrays.sort(arr);
		for(int i = 0; i < m; i++) {
			if(a[arr[i]] == 1) {
				System.out.print(arr[i] + " ");
				a[arr[i]] = 0;
			}
		}
	}

}
