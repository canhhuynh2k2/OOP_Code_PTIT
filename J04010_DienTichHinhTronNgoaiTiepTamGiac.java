/* @author canhhuynh2k2 */
import java.util.*;
class Point{
    private double x, y;
    public Point(){
        this.x = 0F;
        this.y = 0F;
    }
    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    public Point Point(Point a){
        return a;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(Point a){
        return Math.sqrt((this.x - a.getX()) * (this.x - a.getX()) + (this.y - a.getY()) * (this.y - a.getY()));
    }
}
public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            Point a = new Point(in.nextDouble(), in.nextDouble());
            Point b = new Point(in.nextDouble(), in.nextDouble());
            Point c = new Point(in.nextDouble(), in.nextDouble());
            double aa = a.distance(b), bb = b.distance(c), cc = c.distance(a);
            if(aa + bb <= cc || bb + cc <= aa || aa + cc <= bb){
                System.out.println("INVALID");
            }
            else{
                double r = (aa * bb * cc) / Math.sqrt((aa + bb + cc) * (aa + bb - cc) * (aa - bb + cc) * (-aa + bb + cc));
                System.out.printf("%.3f\n", r * r * Math.PI);
            }
        }
    }
}
