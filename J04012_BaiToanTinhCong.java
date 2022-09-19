/* @author canhhuynh2k2 */
import java.util.*;
class TinhCong{
    private String id, name;
    private int salary, bonus, allowance, income;
    public TinhCong(String s, int a, int b, String ss){
        this.id = "NV01";
        this.name = s.trim();
        this.salary = a * b;
        if(b >= 25) this.bonus = this.salary / 5;
        else if(b >= 22) this.bonus = this.salary / 10;
        else this.bonus = 0;
        if(ss.compareTo("GD") == 0) this.allowance = 250000;
        else if(ss.compareTo("PGD") == 0) this.allowance = 200000;
        else if(ss.compareTo("TP") == 0) this.allowance = 180000;
        else this.allowance = 150000;
        this.income = this.salary + this.bonus + this.allowance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getAllowance() {
        return allowance;
    }

    public int getIncome() {
        return income;
    }
}
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TinhCong a = new TinhCong(in.nextLine(), in.nextInt(), in.nextInt(), in.next());
        System.out.printf("%s %s %d %d %d %d\n", a.getId(), a.getName(), a.getSalary(), a.getBonus(), a.getAllowance(), a.getIncome());
    }
}
