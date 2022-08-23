import java.util.*;
class Point{
    private double x, y;
    Point(){
        this.x = 0F;
        this.y = 0F;
    }
    Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    double distance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    static double distance(Point p1, Point p2){
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            Point A = new Point(in.nextDouble(), in.nextDouble());
            Point B = new Point(in.nextDouble(), in.nextDouble());
            Point C = new Point(in.nextDouble(), in.nextDouble());
            double d1 = A.distance(B);
            double d2 = A.distance(C);
            double d3 = B.distance(C);
            if(d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1){
                System.out.printf("%.3f\n", d1 + d2 + d3);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
