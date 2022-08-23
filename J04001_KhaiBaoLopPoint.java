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
public class J04001_KhaiBaoLopPoint {
    static Scanner in = new Scanner(System.in);
    private double x,y;
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-- > 0){
            Point a = new Point(in.nextDouble(), in.nextDouble());
            Point b = new Point(in.nextDouble(), in.nextDouble());
            System.out.println(String.format("%.4f", a.distance(b)));
        }
    }
}
