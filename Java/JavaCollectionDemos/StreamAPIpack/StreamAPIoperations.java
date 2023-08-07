package StreamAPIpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIoperations {
    static List<Student> stdList = Arrays.asList(
            new Student("Tim", 21, 5000.6),
            new Student("Sim", 20, 5000.1),
            new Student("Rim", 22, 5000.5),
            new Student("Qim", 19, 5000.2),
            new Student("Pim", 18, 5000.3));

    public static void main(String[] args) {
        // List<Student> filteredStudents = stdList.stream().filter(Student ->
        // Student.getStdAge() > 20).collect(Collectors.toList());
        List<Student> result = stdList.stream().filter(s -> s.getStdName().startsWith("S"))
                .collect(Collectors.toList());
        List<Student> StudentsAbove18 = stdList.stream().filter((Student s) -> s.getStdAge() > 20)
                .collect(Collectors.toList());
        List<Student> filteredStudents = stdList.stream().limit(3).collect(Collectors.toList());
        

        Double result2 = stdList.stream()
                .filter(s -> s.getStdName().startsWith("S"))
                .map(s -> s.getFeeAmount() + 1000)
                .reduce(0.0, (ans, s) -> ans + s);

        System.out.println("Result2: " + result2);
        System.out.println(filteredStudents);
        System.out.println("Students above 18: " + StudentsAbove18);
        System.out.println("Student Name starting with S: " + result);

        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        number.stream()
                .map(x -> x * x)
                .filter(x -> x > 9)
                .filter(x -> x < 25)
                .forEach(y -> System.out.println(y));
        System.out.println(number.stream()
                .map(x -> x * x)
                .filter(x -> x > 9)
                .reduce(0, (ans, i) -> ans + i));

    }
}
