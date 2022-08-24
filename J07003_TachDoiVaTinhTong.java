import java.util.*;
import java.math.BigInteger;
import java.io.*;
import java.io.FileNotFoundException;
public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in");
            Scanner scanner = new Scanner(obj);
            String data = scanner.nextLine();
            while(data.length() > 1){
                String s1 = data.substring(0, data.length()/2);
                String s2 = data.substring(data.length()/2, data.length());
                BigInteger a = new BigInteger(s1);
                BigInteger b = new BigInteger(s2);
                data = a.add(b).toString();
                System.out.println(data);
            }
        } catch(FileNotFoundException e){
                System.out.println("NOT FOUND");
        } 
    }
}
