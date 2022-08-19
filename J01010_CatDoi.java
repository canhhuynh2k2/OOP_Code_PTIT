import java.util.Scanner;
public class J01010_CatDoi {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String d = in.nextLine();
		while(t > 0) {
			String n;
			n = in.nextLine();
			Long ans = 0L;
			boolean ok = true;
			for(int i = 0; i < n.length(); i++) {
				if(n.charAt(i) == '0' || n.charAt(i) == '8' || n.charAt(i) == '9') ans = ans * 10;
				else if(n.charAt(i) == '1') ans = ans * 10 + 1;
				else {
					ok = false;
					break;
				}
			}
			if(ok == false || ans == 0) System.out.println("INVALID");
			else System.out.println(ans);
			t--;
		}
	}

}
