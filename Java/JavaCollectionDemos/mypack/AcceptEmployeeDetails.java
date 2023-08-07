package mypack;

import java.util.ArrayList;
import java.util.List;

public class AcceptEmployeeDetails {
    
    public static void main(String[] args){
        List<Integer> empSal = new ArrayList<>();

        // Predicate<Integer> positive = i -> i > 10;

        Consumer<String> displayData = x -> System.out.println(x);

        displayData.accept("Hello world....");

        empSal.add(21);
        empSal.add(22);
        empSal.add(23);
        empSal.add(8);

        Consumer<Integer> diplayEmpSalary = x -> {
            if (x > 10){
                x = x - 10;
                System.out.println(x);
            }else{
                x = x + 10;
                System.out.println(x);
            }
            
        };

        fetchData(empSal, diplayEmpSalary);
    }

    public static <T> void fetchData(List<T> ldata, Consumer<T> consume){
        for (T t: ldata){
            consume.accept(t);
        }
    }
}
