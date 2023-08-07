package mypack;

import java.util.function.BiFunction;
import java.util.function.Function;

public class JFIDemo1 {

// Predicate represents an anonymous function that accepts one argument and produces a result.

// Supplier represents an anonymous function that accepts no argument and produces a result.

// Consumer represents an anonymous function that accepts an argument and produces no result.
    public static void main(String[] args) {

        System.out.println(changeCase("Java New Features ", str -> str.toUpperCase()));

        System.out.println(subString("Java New Features ", 3, (str, i) -> str.substring(i)));

    }

    public static String changeCase(String str, Function<String, String> pd) {
        return pd.apply(str);
    }

    public static String subString(String str, int i, BiFunction<String, Integer, String> pd) {
        return pd.apply(str, i);
    }
}
