package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JCSortingDemo {
    public static void main(String[] args) {

        ArrayList<String> empName = new ArrayList<String>();

        empName.add("Tim");
        empName.add("Rim");
        empName.add("Jim");
        empName.add("Kim");

        sortEmpName(empName);

        System.out.println(empName);

    }

    public static void sortEmpName(ArrayList<String> empName) {
        Collections.sort(empName, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }
        });
    }
}