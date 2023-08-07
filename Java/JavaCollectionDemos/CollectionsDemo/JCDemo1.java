package CollectionsDemo;

import java.util.*;

public class JCDemo1{
    public static void main(String[] args){
        ArrayList<String> empDetails = new ArrayList<>();

        empDetails.add("Mr.");
        empDetails.add("Tim");
        empDetails.add("from");
        empDetails.add("India");

        System.out.println("for Each");
        empDetails.forEach(System.out::println);

        System.out.println("num : empDetails");
        for (String word : empDetails) {
            System.out.print(word + " ");
        }

        System.out.println("Iterator");

        Iterator<String> empIter = empDetails.iterator();

        while (empIter.hasNext()){
            System.out.println(empIter.next());
        }
    }
}