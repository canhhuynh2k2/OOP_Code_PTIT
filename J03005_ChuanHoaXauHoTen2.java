import java.util.Scanner;
import java.util.ArrayList;
public class J03005_ChuanHoaXauHoTen2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String ig = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			s = s.toLowerCase();
			int cnt = 0;
			String tmp = null;
			String[] l = s.split("\\s");
			ArrayList<String> a = new ArrayList<String>();
			for(String x : l) {
				if(x.length() > 0) {
					a.add(x);
				}
			}
			for(int i = 1; i < a.size() - 1; i++) {
				StringBuilder y = new StringBuilder(a.get(i));
				y.setCharAt(0, (char)(a.get(i).charAt(0) - 32));
				System.out.print(y + " ");
			}
			StringBuilder y = new StringBuilder(a.get(a.size()-1));
			y.setCharAt(0, (char)(a.get(a.size()-1).charAt(0) - 32));
			System.out.print(y + ", " + a.get(0).toUpperCase());
			System.out.println();
			t--;
		}

	}

}
