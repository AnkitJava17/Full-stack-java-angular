package mypack;

public class JFIDemo2 {

    public static void main(String[] args) {

        System.out.println(changeCase("Java New Features", new IChangeCase() {

            @Override
            public String changecase(String str) {
                return str.toUpperCase();
            }

        }));

    }

    public static String changeCase(String str, IChangeCase pd) {
        return pd.changecase(str);
    }

}
