import java.util.Scanner;
public class J03004_ChuanHoaXauHoTen1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int t = in.nextInt();
		String d = in.nextLine();
		while(t > 0) {
			String s = in.nextLine();
			s = s.toLowerCase();
			String[] l = s.split("\\s");
			for(String x : l) {
				if(x.length() > 0) {
					StringBuilder y = new StringBuilder(x);
					y.setCharAt(0, (char)(x.charAt(0) - 32));
					System.out.print(y + " ");		
				}
			}
			System.out.println();
			t--;
		}

	}
}
