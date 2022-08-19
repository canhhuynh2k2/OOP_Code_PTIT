import java.util.Scanner;
public class J02013_SapXepNoiBot {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		for(int i = 0; i < n; i++) {
			int ok = 0;
			for(int j = 0; j < n - i - 1; j++) {
				if(a[j] > a[j+1]) {
					ok = 1;
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
			if(ok == 1) {
				System.out.print("Buoc " + (i+1) + ": ");
				for(int k = 0; k < n; k++) System.out.print(a[k] + " ");
				System.out.println();
			}
		}
	}
}
