import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException{
        File f = new File("DATA.in");
        Scanner in = new Scanner(f);
        while(in.hasNextLine()){
            String data = in.nextLine().trim();
            if(data.compareTo("END") == 0){
                break;
            }
            String s[] = data.toLowerCase().split("\\s+");
            for(String ss : s){
                if(ss.compareTo("") != 0){
                    System.out.printf("%s ", ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()));
                }    
            }
            System.out.println();
        }
    }
}
