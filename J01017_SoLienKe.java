import java.util.Scanner;
import java.lang.Math;
public class J01017_SoLienKe {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String d = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			int ok = 1;
			for(int i = 1; i < s.length(); i++) {
				if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 1) {
					ok = 0;
					break;
				}
			}
			if(ok == 1) System.out.println("YES");
			else System.out.println("NO");
			t--;
		}
	}

}
