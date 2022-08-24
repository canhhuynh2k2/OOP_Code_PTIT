import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J07002_TinhTong {
    public static void main(String[] args) {
        try {
            File myObj = new File("DATA.in");
            Scanner myReader = new Scanner(myObj);
            long sum = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data += "#";
                String tmp = "";
                for(int i = 0; i < data.length(); i++){
                    if(data.charAt(i) >= '0' && data.charAt(i) <= '9'){
                        tmp += data.charAt(i);
                    }
                    else{
                        try{
                            int x = Integer.parseInt(tmp);
                            sum += x;
                        } catch(Exception e){
                            continue;
                        }
                        tmp = "";
                    }
                }
            }
            System.out.println(sum);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
