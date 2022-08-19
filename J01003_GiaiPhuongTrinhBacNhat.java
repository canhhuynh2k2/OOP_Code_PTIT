import java.util.Scanner;
public class J01003_GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float a, b;
		a = in.nextFloat();
		b = in.nextFloat();
		if(a == 0F && b == 0F) System.out.println("VSN");
		else if(a == 0F && b != 0F) System.out.println("VN");
		else if(a != 0F) System.out.println(String.format("%.2f", -b/a));
	}
}
