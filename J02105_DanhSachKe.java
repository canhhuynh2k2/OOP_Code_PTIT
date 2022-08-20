import java.util.Scanner;
import java.util.ArrayList;
public class J02105_DanhSachKe {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		ArrayList<String> b = new ArrayList<String>();
		
		int[][] a = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			b.add("");
			for(int j = 1; j <= n; j++) {
				a[i][j] = in.nextInt();
				if(a[i][j] == 1) b.set(i-1,  b.get(i-1) + j + " ");
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println("List(" + (i + 1) + ") = " + b.get(i));
		}
	}

}
