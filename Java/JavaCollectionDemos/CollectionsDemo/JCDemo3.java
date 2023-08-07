package CollectionsDemo;

import java.util.*;

public class JCDemo3 {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);

        Iterator<Integer> treeIter = treeSet.iterator();

        while (treeIter.hasNext()){
            System.out.println(treeIter.next());
        }

        System.out.println();

        HashSet<Integer> hset = new HashSet<>();
        hset.add(3);
        hset.add(1);
        hset.add(4);
        hset.add(2);

        hset.forEach(System.out::println);
        System.out.println();
        for (Integer obj:hset){
            System.out.println(obj);
        }
        
    }
}