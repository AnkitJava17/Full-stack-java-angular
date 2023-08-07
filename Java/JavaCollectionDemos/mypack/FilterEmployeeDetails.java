package mypack;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeDetails {
    public static void main(String[] args) {

        ArrayList<Integer> empSal = new ArrayList<Integer>();

        Predicate<Integer> positiveData = i -> i > 0;

        empSal.add(21);
        empSal.add(22);
        empSal.add(23);
        empSal.add(-18);
        empSal.add(-17);

        List<Integer> finalOutput = filterList(empSal, positiveData);

        finalOutput.forEach(System.out::println);
    }

    public static List<Integer> filterList(List<Integer> ldata, Predicate<Integer> pd) {
        ArrayList<Integer> filteredData = new ArrayList<Integer>();

        for (Integer mydata : ldata) {
            if (pd.test(mydata)) {
                filteredData.add(mydata);
            }
        }

        return filteredData;
    }
}
