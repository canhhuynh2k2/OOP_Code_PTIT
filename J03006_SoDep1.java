import java.util.Scanner;
public class J03006_SoDep1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String ig = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			int ok = 1;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != '0' && s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8') {
					ok = 0;
					break;
				}
			}
			StringBuilder y = new StringBuilder(s);
			if(ok == 1 && y.reverse().toString().equals(s)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}

	}

}
