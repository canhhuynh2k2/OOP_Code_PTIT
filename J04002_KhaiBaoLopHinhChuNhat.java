import java.util.*;
class Rectange{
    private double width, height;
    private String color;
    Rectange(){
        this.width = 1F;
        this.height = 1F;
    }
    Rectange(double w, double h, String c){
        this.width = w;
        this.height = h;
        c = c.toLowerCase();
        c = c.substring(0, 1).toUpperCase() + c.substring(1, c.length());
        this.color = c;
    }
    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }
    void setWidth(double x){
        this.width = x;
    }
    void setHeight(double x){
        this.height = x;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String c){
        c = c.toLowerCase();
        c = c.substring(0, 1).toUpperCase() + c.substring(1, c.length());
        this.color = c;
    }
    double findArea(){
        return this.width * this.height;
    }
    double findPerimeter(){
        return (this.width + this.height) * 2;
    }
}
public class J04002_KhaiBaoLopHinhChuNhat {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        long x = 0, y = 0;
        int ok = 1;
        String c = "";
        try{
            x = in.nextLong();
            y = in.nextLong();
            c = in.next(); 
            if(x <= 0 || y <= 0){
                System.out.println("INVALID");
                ok = 0;
            }
        } catch(Exception e){
            System.out.println("INVALID");
            ok = 0;
        }
        if(ok == 1){
            Rectange R = new Rectange(x, y, c);
            System.out.println(String.format("%.0f %.0f %s", R.findPerimeter(), R.findArea(), R.getColor()));
        }
    }
}
