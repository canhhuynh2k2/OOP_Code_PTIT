import java.util.Scanner;
public class J01024_SoTamPhan {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String d = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			int ok = 1;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
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
