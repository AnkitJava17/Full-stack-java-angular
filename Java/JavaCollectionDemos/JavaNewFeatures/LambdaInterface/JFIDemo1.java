package JavaNewFeatures.LambdaInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class JFIDemo1 {

    public static void main(String[] args){

        System.out.println(changeCase("JAVA NEW FEATURES ", str -> str.toLowerCase()));

        System.out.println(changeCase("JAVA NEW FEATURES ", str -> str.toLowerCase()));

        System.out.println(subString("java new features", 3, (str,i) -> str.substring(i)));
    }

    public static String changeCase(String str, Function<String, String> pd){
        return pd.apply(str);
    }

    public static String subString(String str, int i, BiFunction<String, Integer, String> pd){
        return pd.apply(str, i);
    }
}

