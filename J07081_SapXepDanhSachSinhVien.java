/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
class SINHVIEN{
    private String number, fullName, name, phone, email, lastName;
    public SINHVIEN(String s1, String s2, String s3, String s4){
        this.number = s1.trim();
        this.fullName = s2.trim();
        this.phone = s3.trim();
        this.email = s4.trim();
        String[] ss = s2.trim().split("\\s+");
        this.name = ss[ss.length-1];
        String str = "";
        for(int i = 0; i < ss.length - 1; i++){
            str = str + ss[i] + " ";
        }
        this.lastName = str.trim();
    }
    public String getNumber(){
        return this.number;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getLastName(){
        return this.lastName;
    }
}
public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = in.nextInt();
        String ig = in.nextLine();
        List<SINHVIEN> l = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            l.add(new SINHVIEN(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(l, new Comparator<SINHVIEN>(){
            public int compare(SINHVIEN a, SINHVIEN b){
                if(a.getName().compareTo(b.getName()) < 0) return -1;
                else if(a.getName().compareTo(b.getName()) == 0){
                    if(a.getLastName().compareTo(b.getLastName()) < 0) return -1;
                    else if(a.getLastName().compareTo(b.getLastName()) == 0) return a.getNumber().compareTo(b.getNumber());
                }
                return 1;
            }
        });
        for(SINHVIEN x : l){
            System.out.printf("%s %s %s %s\n", x.getNumber(), x.getFullName(), x.getPhone(), x.getEmail());
        }
    }
}
