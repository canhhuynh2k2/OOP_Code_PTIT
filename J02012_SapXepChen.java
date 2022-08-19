import java.util.Scanner;
public class J02012_SapXepChen {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		for(int i = 0; i < n; i++) {
			int j = i - 1, key = a[i];
			while(j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			if(j >= -1) a[j+1] = key;
			System.out.print("Buoc " + i + ": ");
			for(int k = 0; k <= i; k++) System.out.print(a[k] + " ");
			System.out.println();
		}

	}
}
