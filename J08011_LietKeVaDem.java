
package J08011;
import java.util.*;
public class J08011_LietKeVaDem {
    public static <K, V extends Comparable<V> > Map<K, V> sortValue(final TreeMap<K, V> map, final HashMap<K, V> mp){
        Comparator<K> comparator = new Comparator<K>(){
            public int compare(K K1, K K2){
                int cmp = map.get(K1).compareTo(map.get(K2));
                if(cmp > 0) return -1;
                else if(cmp == 0){
                    if(mp.get(K1).compareTo(mp.get(K2)) < 0) return -1;
                }
                return 1;
            }
        };
        Map<K, V> sorted = new TreeMap<K, V>(comparator);
        sorted.putAll(map);
        return sorted;
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) > s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Long, Integer> hm = new TreeMap<>();
        HashMap<Long, Integer> hm2 = new HashMap<>();
        int i = 0;
        while(in.hasNext()){
            String s = in.next();
            if(!check(s)) continue;
            long a = Long.parseLong(s);
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a) + 1);
            }
            else{
                hm2.put(a, i);
                i++;
                hm.put(a, 1);
            }
        }
        
        Map<Long, Integer> sortedMap = sortValue(hm, hm2);
        Set set = sortedMap.entrySet();
        Iterator it = set.iterator();
  
        while (it.hasNext())
        {
            Map.Entry mp = (Map.Entry)it.next();
  
            System.out.print(mp.getKey() + " ");
  
            System.out.println(mp.getValue());
        }
    }
}

