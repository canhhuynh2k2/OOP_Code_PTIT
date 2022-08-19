import java.util.Scanner;
public class J02011_SapXepChon {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		for(int i = 0; i < n - 1; i++) {
			int index = i;
			for(int j = i + 1; j < n; j++) {
				if(a[index] > a[j]) index = j;
			}
			int tmp = a[i];
			a[i] = a[index];
			a[index] = tmp;
			System.out.print("Buoc " + (i + 1) + ": ");
			for(int j = 0; j < n; j++) System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}
