package lambdas.stringReverse;

public class BlockLambda {
    public static void main(String[] args) {

        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("lambda dawn to -> " + reverse.func("L a m b d a"));
        System.out.println("the expression reverse to -> " + reverse.func("E x p r e s s i o n"));
        System.out.println(reverse.func("hello !!!"));
    }
}
