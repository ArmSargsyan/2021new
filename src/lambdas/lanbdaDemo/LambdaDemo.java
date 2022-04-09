package lambdas.lanbdaDemo;

public class LambdaDemo {
    public static void main(String[] args) {

        NumericTest isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("number 2 is factorial number 10 ");
        if (!isFactor.test(10,3))
            System.out.println("number 3 does not factorial number 10 ");
    }
}
