package CollectionsDemo;

import java.util.LinkedList;

public class JCDemo2 {

    public static void main(String[] args) {

        LinkedList empDetails = new LinkedList<>();

        empDetails.add(1001);
        empDetails.add("Tim");
        empDetails.add(23);
        empDetails.add("India");


        empDetails.forEach(System.out::println);

    }
}
