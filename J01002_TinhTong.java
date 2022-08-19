import java.util.Scanner;
public class J01002_TinhTong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t > 0) {
			long n = in.nextLong();
			System.out.println((1 + n) * n / 2);
			 t--;
		}

	}

}
