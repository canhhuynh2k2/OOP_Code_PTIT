import java.util.Scanner;
public class J02006_HopCuaHaiDaySo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int b[] = new int[1005], x;
		for(int i = 0; i < n; i++) {
			x = in.nextInt();
			b[x] = 1;
		}
		for(int i = 0; i < m; i++) {
			x = in.nextInt();
			b[x] = 1;
		}
		for(int i = 0; i < 1005; i++) {
			if(b[i] == 1) System.out.print(i + " ");
		}
	}
}
