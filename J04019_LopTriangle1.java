// @author canhhuynh2k2
import java.util.*;
class Point{
    private double x, y;
    public Point(Double a, Double b){
        x = a;
        y = b;
    }
    public static Point nextPoint(Scanner s){
        Point X = new Point(s.nextDouble(), s.nextDouble());
        return X;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
class Triangle{
    private Point a, b, c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        Double c1 = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        Double c2 = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        Double c3 = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
        if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        Double c1 = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        Double c2 = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        Double c3 = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
        return String.format("%.3f", c1 + c2 + c3);
    }
}
public class J04019_LopTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
