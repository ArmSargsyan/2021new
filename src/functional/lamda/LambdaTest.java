package functional.lamda;

public class LambdaTest {
    public static void main(String[] args) {

        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random() *100;
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());


        NumericBloc numericBloc;
        numericBloc = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(numericBloc.func(3));
        System.out.println(numericBloc.func(5));



        Numeric2 numeric2 = (n, d) -> (n % d) == 0;
        if (numeric2.test(10,2))
            System.out.println("2 % 10 is okk");
        if (!numeric2.test(10, 3))
            System.out.println("3 % 10 is falce");


        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length()-1; i >=0 ; i--)
                result += str.charAt(i);

          return result;
        };
        System.out.println(reverse.goodStr("Hello"));
        System.out.println(reverse.goodStr("World ! ! !"));

    }
}
