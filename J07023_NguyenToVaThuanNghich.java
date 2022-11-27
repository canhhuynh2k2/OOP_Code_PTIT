/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07023_NguyenToVaThuanNghich;
import java.util.*;
import java.io.*;
public class J07023_NguyenToVaThuanNghich {
    public static boolean isPrime(int x){
        if(x < 2) return false;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }
    public static boolean thuanNghich(int x){
        String s = String.valueOf(x);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        Set<Integer> st = new TreeSet<>();
        List<Integer> lst1 = (ArrayList<Integer>) obj1.readObject();
        List<Integer> lst2 = (ArrayList<Integer>) obj2.readObject();
        for(int x : lst1){
            if(isPrime(x) && thuanNghich(x)){
                if(hm1.containsKey(x)){
                    hm1.put(x, hm1.get(x) + 1);
                }
                else{
                    hm1.put(x, 1);
                }
            }
        }
        for(int x : lst2){
            if(isPrime(x) && thuanNghich(x) && hm1.containsKey(x)){
                st.add(x);
                if(hm2.containsKey(x)){
                    hm2.put(x, hm2.get(x) + 1);
                }
                else{
                    hm2.put(x, 1);
                }
            }
        }
        for(int x : st){
            System.out.println(x + " " + hm1.get(x) + " " + hm2.get(x));
        }
    }
}
