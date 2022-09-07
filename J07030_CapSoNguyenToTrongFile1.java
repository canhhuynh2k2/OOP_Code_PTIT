/* Author: canhhuynh2k2 */
import java.util.*;
import java.io.*;
public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l1 = (ArrayList<Integer>) obj1.readObject();
        List<Integer> l2 = (ArrayList<Integer>) obj2.readObject();
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        for(int i : l1){
            if(isPrime(i)){
                s1.add(i);
            }
        }
        for(int j : l2){
            if(isPrime(j)){
                s2.add(j);
            }
        }
        for(Integer j : s1){
            if(s2.contains(1000000-j) && j < 1000000-j){
                System.out.println(j + " " + (1000000-j));
            }
        }
    }
}
