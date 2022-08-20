import java.util.Scanner;
public class J02104_DanhSachCanh {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int[][] a = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for(int i = 1; i <= n; i++) {
			for(int j = i + 1; j <= n; j++) {
				if(a[i][j] == 1) System.out.println("(" + i + "," + j + ")");
			}
		}
	}
}
