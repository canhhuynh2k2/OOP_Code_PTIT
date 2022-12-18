
import java.util.*;
import java.io.*;
public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            int index = s1.indexOf(s2);
            while(index != -1){
                System.out.print((index + 1) + " ");
                index = s1.indexOf(s2, index + 1);
            }
            System.out.println();
        }
    }
}
