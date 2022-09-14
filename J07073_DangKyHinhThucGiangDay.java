/* @author canhhuynh2k2 */
import java.io.*;
import java.util.*;
class DangKy{
    private String number, name, numberOfCredits, teachingForm, practiceForm;
    public DangKy(String s1, String s2, String s3, String s4, String s5){
        this.number = s1.trim();
        this.name = s2.trim();
        this.numberOfCredits = s3.trim();
        this.teachingForm = s4.trim();
        this.practiceForm = s5.trim();
    }
    public String getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    public String getNumberOfCredits(){
        return this.numberOfCredits;
    }
    public String getTeachingForm(){
        return this.teachingForm;
    }
    public String getPracticeForm(){
        return this.practiceForm;
    }
}
public class J07073_DangKyHinhThucGiangDay {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = in.nextInt();
        String ig = in.nextLine();
        List<DangKy> l = new ArrayList<>();
        for(int i = 0; i < t; i++){
            l.add(new DangKy(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(l, new Comparator<DangKy>(){
            @Override
            public int compare(DangKy a, DangKy b){
                return a.getNumber().compareTo(b.getNumber());
            }
        });
        for(DangKy x : l){
            if(x.getPracticeForm().indexOf(".ptit.edu.vn") != -1 || x.getPracticeForm().compareTo("Truc tuyen") == 0){
                System.out.printf("%s %s %s %s %s\n", x.getNumber(), x.getName(), x.getNumberOfCredits(), x.getTeachingForm(), x.getPracticeForm());
            }
        }
    }
}
