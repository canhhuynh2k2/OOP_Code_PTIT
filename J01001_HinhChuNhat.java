import java.util.Scanner;
public class J01001_HinhChuNhat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if(x <= 0 || y <= 0) System.out.println(0);
		else {
			System.out.print((x+y)*2);
			System.out.println(" " + x * y);		
		}
	}

}
