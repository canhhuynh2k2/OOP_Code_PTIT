import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class HELLOFILE_HELLOFILE {
	public static void main(String[] args) {
		try {
			File f = new File("Hello.txt");
			Scanner myReader = new Scanner(f);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
