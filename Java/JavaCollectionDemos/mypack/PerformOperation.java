package mypack;

public class PerformOperation {
    public static void main(String[] args) {

        Function<String, Integer> lenFunc = x -> x.length();
        Function<Integer, Integer> powerFunc = x -> x * x;

        int strLen = lenFunc.apply("I m Learning Java");
        System.out.println(strLen);

        Integer powerResult = powerFunc.apply(4);

        System.out.println(powerResult);
    }

}
