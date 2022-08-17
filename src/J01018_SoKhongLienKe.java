import java.util.Scanner;
import java.lang.Math;
public class J01018_SoKhongLienKe {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String d = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			int ok = 1, sum = s.charAt(0) - 48;
			for(int i = 1; i < s.length(); i++) {
				sum += s.charAt(i) - 48;
				if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 2) {
					ok = 0;
				}
			}
			if(ok == 1 && sum % 10 == 0) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}
	}

}
