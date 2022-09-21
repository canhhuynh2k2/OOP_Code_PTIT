package J05003_DanhSachDoiTuongSinhVien1;
import java.util.*;
class SinhVien{
    private String id, name, CLASS, dateOfBirth;
    private float gpa;
    public SinhVien(int c, String s1, String s2, String s3, float s4){
        String x = String.valueOf(c);
        while(x.length() < 3) x = "0" + x;
        this.id = "B20DCCN" + x;
        String s[] = s1.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(String ss : s){
            ten = ten + ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()) + " ";
        }
        this.name = ten;
        this.CLASS = s2.trim();
        if(s3.charAt(1) == '/') s3 = "0" + s3;
        if(s3.charAt(4) == '/') s3 = s3.substring(0, 3) + "0" + s3.substring(3);
        this.dateOfBirth = s3;
        this.gpa = s4;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCLASS() {
        return CLASS;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }
    
}
public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<SinhVien> lst = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ig = in.nextLine();
            lst.add(new SinhVien(i+1, in.nextLine(), in.nextLine(), in.nextLine(), in.nextFloat()));
        }
        for(SinhVien x : lst){
            System.out.printf("%s %s %s %s %.2f\n", x.getId(), x.getName(), x.getCLASS(), x.getDateOfBirth(), x.getGpa());
        }
    }
}
