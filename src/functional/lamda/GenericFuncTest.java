package functional.lamda;

public class GenericFuncTest {
    public static void main(String[] args) {

        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("hello");
        System.out.println("friend");

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <=n; i++)
                result = i*result;
                return result;
        };
        System.out.println(factorial.func(3));
        System.out.println(factorial.func(5));
    }
}
