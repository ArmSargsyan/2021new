package lambdas.lambdaGenerik;

public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {

        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(reverse.func("Hello"));
        System.out.println(reverse.func("Java"));


        SomeFunc<Integer> factorial = (num) -> {
            int result = 1;
            for (int i = 0; i < num; i++)
                result += result * i;
            return result;
        };
        System.out.println(factorial.func(5));
    }
}
