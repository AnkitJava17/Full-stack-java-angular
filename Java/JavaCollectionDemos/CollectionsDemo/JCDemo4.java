package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;


public class JCDemo4 {
    public static void main(String[] args){
        HashMap<Integer,String> hmap = new HashMap<>();
        
        hmap.put(102, "product1");
        hmap.put(101, "product2");
        hmap.put(105, "product3");
        hmap.put(103, "product4");
        hmap.put(104, "product5");

        for (Integer key: hmap.keySet()){
            System.out.println(key + " " + hmap.get(key));
        }

        System.out.println();

        for (Map.Entry entry: hmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
