import java.util.Scanner;
import java.io.*;
class SinhVien{
    private String numStu, name, BornDate, Class;
    private float GPA;
    public String getNumStu(){
        return this.numStu;
    }
    public String getName(){
        return this.name;
    }
    public String getBornDate(){
        return this.BornDate;
    }
    public String getclass(){
        return this.Class;
    }
    public float getGPA(){
        return this.GPA;
    }
    public void setNumStu(String s){
        this.numStu = s;
    }
    public void setName(String s){
        this.name = s;
    }
    public void setClass(String s){
        this.Class = s;
    }
    public void setBornDate(String s){
        this.BornDate = s;
    }
    public void setGPA(float f){
        this.GPA = f;
    }
}
public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) {
        try{
            File f = new File("SV.in");
            Scanner in = new Scanner(f);
            int n = Integer.parseInt(in.nextLine());
            SinhVien sv[] = new SinhVien[n];
            for(int i = 0; i < n; i++){
                sv[i] = new SinhVien();
                String num = String.valueOf(i+1);
                while(num.length() < 3) num = "0" + num;
                sv[i].setNumStu("B20DCCN" + num);
                sv[i].setName(in.nextLine());
                sv[i].setClass(in.nextLine());
                String x = in.nextLine();
                StringBuilder sb = new StringBuilder(x);
                if(sb.charAt(1) == '/'){
                    sb.insert(0, '0');
                }
                if(sb.charAt(4) == '/'){
                    sb.insert(3, '0');
                }
                sv[i].setBornDate(sb.toString());
                sv[i].setGPA(Float.parseFloat(in.nextLine()));
            }
            for(int i = 0; i < n; i++){
                System.out.printf("%s %s %s %s %.2f\n", sv[i].getNumStu(), sv[i].getName(), sv[i].getclass(), sv[i].getBornDate(), sv[i].getGPA());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
