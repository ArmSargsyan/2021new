package lambdas.lambdasAsArgument;

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambdas as effective for Java";
        String outStr;

        System.out.println("it is original text " + inStr);

        outStr = stringOp((str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println(outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("this is generic text: " + stringOp(reverse, inStr));
    }
}
